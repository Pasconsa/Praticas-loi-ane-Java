package poliformismoAnimais;

public class Peixe extends Animal {
	
	private String corEscama ;
	
	public void soltarBolha () {
		
	}

	@Override
	public void locomover() {
		System.out.println("nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo substancia");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("não tem som");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	

}
