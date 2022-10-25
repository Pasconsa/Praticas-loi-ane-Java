package registroColecaoGames;

import java.util.Objects;

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



	@Override
	public String toString() {
		return "Game [produtora=" + produtora + ", quantJogadores=" + quantJogadores + ", nome=" + nome
				+ ", anoLancamento=" + anoLancamento + ", tipoMidia=" + tipoMidia + "]";
	}


	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(produtora, quantJogadores);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(produtora, other.produtora) && quantJogadores == other.quantJogadores;
	}
	
	
	
	
	

}
