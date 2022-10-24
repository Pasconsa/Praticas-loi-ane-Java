package registroColeçãoGames;

import java.security.Identity;

public class Game extends ObjetoFisicoGame {
	
	private Long id;
	private String produtora;
	private int quantJogadores;
	
	
	
	

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public int getQuantJogadores() {
		return quantJogadores;
	}

	public void setQuantJogadores(int quantJogadores) {
		this.quantJogadores = quantJogadores;
	}
	
	
	
	

}
