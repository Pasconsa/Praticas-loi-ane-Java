package poliformismoAnimais;

public class Ave extends Animal {
	
	private String corPena;
	
	public void fazerNinho() {  //metodo necessário criar um corpo
		
	}
	
	@Override
	public void locomover() {
		System.out.println("voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comendo frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som de ave");
		
	}
	public String getCorPena() {
		return corPena;
	}
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}




	

}
