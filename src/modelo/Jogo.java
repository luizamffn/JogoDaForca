package modelo;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Jogo {
	private Palavra palavra = new Palavra();
	private Jogador jogador;
	private Boneco boneco;
	private String[] palavraDaRodada;
	private String[] palavraSorteada;
	private Set<String> PalavraJaDitas = new HashSet<>();
	private String auxiliar = "";
	private String auxiliarPalavras = "";
	
	public Jogo(Jogador jogador) {
		this.jogador = jogador;
		palavraSorteada = palavra.sotearPalavra().split("");
		boneco = new Boneco();
		
		boneco.bonecoExibir();
		
		palavraDaRodada = new String[palavraSorteada.length];
		for (int i = 0; i < palavraDaRodada.length; i++) {
			palavraDaRodada[i] = "_ ";
			auxiliar += "_ ";
		}
		
	}
	
	public String exibir() {
		String dados ="Jogador: " + jogador.getNome() + "\n"
				+ "Pontos: " + jogador.getPontos() + "\n"
				+ "Palavras usadas : " + auxiliarPalavras + "\n"
				+ boneco + "\n"
				+"Dica: " +  palavra.getDica()
				+ "\n" + auxiliar;
		
		return dados;
	}
	
	
	public void DigaUmaLetra(String letra) {
		auxiliarPalavras = "";
		letra = letra.toUpperCase();
		int cont = 0;
		
		if(!PalavraJaDitas.contains(letra)){
			PalavraJaDitas.add(letra);
			
			for (String ditas : PalavraJaDitas) {
				auxiliarPalavras += ditas + " ";
				
			}
			for (int i = 0; i < palavraSorteada.length; i++) {
				if(palavraSorteada[i].toUpperCase().equals(letra)){
					palavraDaRodada[i] = letra;
					
					jogador.setPontos(jogador.getPontos() + 100);
					cont++;	
				}
			}
			
			if(cont == 0){
				boneco.setErro(boneco.getErro()+1);
				boneco.bonecoExibir();
			}
			
			auxiliar = "";
			for (int i = 0; i < palavraDaRodada.length; i++) {
					auxiliar += palavraDaRodada[i];
			}

		}else{
			JOptionPane.showMessageDialog(null, "Letra ja dita, Diga outra!");
		}
	}
	
	public int  comparacao(){
		String palavra1 = "", palavra2 = "";
		for (int i = 0; i < palavraDaRodada.length; i++) {
			palavra1 += palavraDaRodada[i];
			palavra2 += palavraSorteada[i].toUpperCase();
		}
		
		if (palavra1.equals(palavra2)) {
			return 1;
		}else{
			return 0;
		}
		
	}
	
	
	public Palavra getPalavra() {
		return palavra;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public Boneco getBoneco() {
		return boneco;
	}

	public String[] getPalavraDaRodada() {
		return palavraDaRodada;
	}

	public String[] getPalavraSorteada() {
		return palavraSorteada;
	}

	public String getAuxiliar() {
		return auxiliar;
	}	
	
}
