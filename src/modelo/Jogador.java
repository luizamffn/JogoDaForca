package modelo;

public class Jogador {
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
	

	
}
