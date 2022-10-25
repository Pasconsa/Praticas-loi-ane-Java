package registroColecaoGames;

import java.util.Objects;

public class Console extends ObjetoFisicoGame{
	
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
	
	
	
	
	//Equals e HashcoDe
@Override
	public int hashCode() {
		return Objects.hash(geraçao, marca);
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
		return geraçao == other.geraçao && Objects.equals(marca, other.marca);
	}

	//to string
	@Override
	public String toString() {
		return "Console [marca=" + marca + ", geraçao=" + geraçao + ", nome=" + nome + ", anoLancamento="
				+ anoLancamento + ", tipoMidia=" + tipoMidia + "]";
	}
	
	
	

}
