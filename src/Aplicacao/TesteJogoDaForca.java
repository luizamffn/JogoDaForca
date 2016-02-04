package Aplicacao;
import javax.swing.JOptionPane;

import modelo.Jogador;
import modelo.Jogo;

public class TesteJogoDaForca {
	
	public static void main(String[] args) {
		Jogador jogador;
		Jogo jogo;
		int erros;
		
		
		
		while (true) {
			int op = menu();
			switch (op) {
			case 0:
				msg("Tchau!!");
				break;
			case 1:
				String nome = JOptionPane.showInputDialog("Nome do jogador");
				jogador = new Jogador(nome);
				jogo = new Jogo(jogador);
				
				while (true) {
					erros = 0;
					String letra = JOptionPane.showInputDialog(jogo.exibir());
					jogo.DigaUmaLetra(letra);
					
					int comp = jogo.comparacao();
				
//					System.out.println(jogo.getBoneco().getErro());		
					if (jogo.getBoneco().getErro() > 6) {
						msg("Voce Perdeu, tente novamente!");
						break;
					}
					
					if (comp == 1) {
						msg("Parabens" + jogo.getJogador().getNome() + ", voce acertou!!"
								+ "\nA palavra era: " + jogo.getAuxiliar());
						break;
					}
				}
				break;
			default:
				msg("Opcao Invalida");
				break;
			}
			
			if(op ==0) break;
		}
		
	}
	
	public static int menu() {
		String menu = "#####Jogo da Forca######\n"+
						"1- Iniciar Jogo\n"+
						"2- Ranking \n"+
						"0- Sair";
		int op =  Integer.valueOf(JOptionPane.showInputDialog(menu));
		
		return op;
		
	}

	private static void novaPalavra() {
		msg("Nova Palavra");
	}

	private static void msg(String str) {
		JOptionPane.showMessageDialog(null,str );
	}
		
}
