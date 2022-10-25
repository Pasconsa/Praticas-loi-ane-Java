package registroColecaoGames;

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

	
	
}
