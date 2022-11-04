package registroColecaoGames;


import java.util.Objects;

public class Console extends ObjetoFisicoGame{
	
	private String marca;
	private int geracao;
	private Game[] games;   //associação 1 console tem muitos games

	int calcularAnos() {                       //metodo com retorno    //sobrecarga poliformismo
		return 2022 - getAnoLancamento();

	}
	
	int calcularAnos(int esteAno, int anoLancamento) {  //metodo com parametros  //sobrecarga poliformismo
		int calcularAnos = esteAno - anoLancamento;
		return calcularAnos;
	}

	
	
	
	public Console() {
	
	}

	public Console(String nome_, String marca_, int anoLancamento_, Midia tipoMidia_ , int geracao_){   //construtor com parametros
		this.nome = nome_;
		this.marca = marca_;
		this.anoLancamento = anoLancamento_;
		this.tipoMidia = tipoMidia_;
		this.geracao = geracao_;
	}
	
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGeracao() {
		return geracao;
	}

	public void setGeracao(int geracao) {
		this.geracao = geracao;
	}
	
	
	public Game[] getGames() {
		return games;
	}

	public void setGames(Game[] games) {
		this.games = games;
	}

//Equals e HashcoDe
@Override
	public int hashCode() {
		return Objects.hash(geracao, marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Console other = (Console) obj;
		return geracao == other.geracao && Objects.equals(marca, other.marca);
	}

	//to string
	@Override
	public String toString() {
		return "Console [marca=" + marca + ", geraçao=" + geracao + ", nome=" + nome + ", anoLancamento="
				+ anoLancamento + ", tipoMidia=" + tipoMidia + "]";
	}
	
	
	

}
