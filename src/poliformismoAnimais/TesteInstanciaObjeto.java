package poliformismoAnimais;

public class TesteInstanciaObjeto {
public static void main(String[] args) {
	
	Mamifero m = new Mamifero();
	Reptil r = new Reptil();
	Peixe p = new Peixe ();
	Ave a = new Ave ();
	
	m.alimentar();
	m.emitirSom();
	m.locomover();
}
	
}
