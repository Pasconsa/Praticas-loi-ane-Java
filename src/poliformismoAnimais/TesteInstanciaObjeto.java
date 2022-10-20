package poliformismoAnimais;


public class TesteInstanciaObjeto {
public static void main(String[] args) {
	
	Mamifero m = new Mamifero();
	Reptil r = new Reptil();
	Peixe p = new Peixe ();
	Ave a = new Ave ();
	
	Cachorro c = new Cachorro();
	Canguru k = new Canguru ();
	
	
	c.locomover();    // Exemplo de sobreposição = mesma assinatura com classes diferentes
	k.locomover();
}
	
}
