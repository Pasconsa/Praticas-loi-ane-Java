package registroColecaoGames;


public class Console extends ObjetoFisicoGame{
	
	private Long id;
	private String marca;
	private int geraçao;

	int calcularAnos() {                       //metodo com retorno
		return 2022 - getAnoLancamento();

	}
	
	int calcularAnos(int esteAno, int anoLancamento) {  //metodo com parametros
		int calcularAnos = esteAno - anoLancamento;
		return calcularAnos;
	}

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getGeraçao() {
		return geraçao;
	}

	public void setGeraçao(int geraçao) {
		this.geraçao = geraçao;
	}
	
	
	

}
