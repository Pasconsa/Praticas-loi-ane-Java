package PoliformismoSobreposiçãoSobrecarga;


public class TesteSobrecargaSobreposição {
public static void main(String[] args) {
	
	Mamifero m = new Mamifero();
	Lobo l = new Lobo();
	Cachorro c = new Cachorro();
	
	//Aplicação de poliformismo sobreposto
	m.emitirSom();
	l.emitirSom();
	c.emitirSom();
	
	System.out.println();
	
	System.out.println("Reacao do cachorro");
	c.reagir(false);
	c.reagir("Toma comida");
	c.reagir(10, 5);
	c.reagir(12, 0);
}
	
}
