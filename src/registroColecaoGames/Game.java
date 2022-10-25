package registroColecaoGames;

import java.util.Objects;

public class Game extends ObjetoFisicoGame {
	
	private String produtora;
	private String genero;
	
	public Game() {
		
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(genero, produtora);
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
		return Objects.equals(genero, other.genero) && Objects.equals(produtora, other.produtora);
	}

	@Override
	public String toString() {
		return "Game [nome=" + nome + ", produtora=" + produtora + ", genero=" + genero + ", anoLancamento="
				+ anoLancamento + ", tipoMidia=" + tipoMidia + "]";
	}
	
	
	
	
	


	
	

}
