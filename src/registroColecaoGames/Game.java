package registroColecaoGames;


public class Game extends ObjetoFisicoGame {
	
	private String produtora;
	private int quantJogadores;
	
	
	Game(String nome_, String produtora_, int anoLancamento_){   //construtor com parametros
		this.nome = nome_;
		this.produtora = produtora_;
		this.anoLancamento = anoLancamento_;
	}
	
	

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
