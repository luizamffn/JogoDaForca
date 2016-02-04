package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Palavra {
	private List<String[]> nome = new ArrayList<>();
	private String dica;
	private Tema tema;
	
	public Palavra() {
		tema = new Tema();
		nome.add(new String[]{"Cachorro", "Gato", "Papagaio", "Periquito"});
		nome.add(new String[]{"Banana", "Maca", "Laranja", "Abacaxi"});
		nome.add(new String[]{"Brasil", "Alemanha", "Portugual", "Australia"});
		nome.add(new String[]{"Computador", "Scanner", "Smarthphone", "Camera", "Relogio"});
	}
	
	
	public String sotearPalavra() {
		String escolherTema = (tema.getNome()[new Random().nextInt(tema.getNome().length)]);
		String escolherPalavra = null;
		
		if(escolherTema == "Animal"){
			escolherPalavra = (nome.get(0)[new Random().nextInt(nome.get(0).length)]);
		}else if(escolherTema == "Fruta"){
			escolherPalavra = (nome.get(1)[new Random().nextInt(nome.get(1).length)]);
		}else if(escolherTema == "Pais"){
			escolherPalavra = (nome.get(2)[new Random().nextInt(nome.get(2).length)]);
		}else if(escolherTema == "Eletronicos"){
			escolherPalavra = (nome.get(3)[new Random().nextInt(nome.get(3).length)]);
		}
		
		this.dica = escolherTema;
		
		return escolherPalavra;
	}
		
	public String getDica() {
		return dica;
	}


	public List<String[]> getNome() {
		return nome;
	}
	
	
	
}
