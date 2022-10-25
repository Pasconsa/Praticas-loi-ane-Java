package registroColecaoGames;

import java.util.Objects;

public abstract class ObjetoFisicoGame {
	
	protected String nome ;
	protected  int anoLancamento ;
	protected  Midia tipoMidia ;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public Midia getTipoMidia() {
		return tipoMidia;
	}
	public void setTipoMidia(Midia tipoMidia) {
		this.tipoMidia = tipoMidia;
	}
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(anoLancamento, nome, tipoMidia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjetoFisicoGame other = (ObjetoFisicoGame) obj;
		return anoLancamento == other.anoLancamento && Objects.equals(nome, other.nome) && tipoMidia == other.tipoMidia;
	}

	
	
	
	
	
}
