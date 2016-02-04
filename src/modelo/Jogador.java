package modelo;

public class Jogador implements Comparable<Jogador>{
	private String nome;
	private int pontos = 0;
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	 public int compareTo(Jogador outraJogador) {
	        if (this.pontos < outraJogador.pontos) {
	            return -1;
	        }
	        if (this.pontos > outraJogador.pontos) {
	            return 1;
	        }
	        return 0;
	}
	
	@Override
	public String toString() {
		return this.nome + " " +  this.pontos + "\n";
	}
}
