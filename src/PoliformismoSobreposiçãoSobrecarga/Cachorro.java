package PoliformismoSobreposiçãoSobrecarga;

public class Cachorro extends Mamifero {

	@Override
	public void emitirSom() {
		System.out.println("AU au au");
	}

	public void reagir(String frase) {
		if (frase.equals("Toma comida") || frase.equals("ola")) { // use equals para comparar ja que o objeto é uma
																	// string
			System.out.println("Abanar o rabo e latir");
		} else {
			System.out.println("rosnar");
		}
	}

	public void reagir( int hora, int min ) {
			if(hora < 12) { 
				System.out.println("abanar o rabo");
			}else if (hora >= 12 & hora <= 18) {
				System.out.println("abanar e latir");
			}else {
				System.out.println("ignorar");
			}
	}
	
	
	public void reagir (boolean dono) {
		if(dono) {
			System.out.println("abanar");
		}else {
			System.out.println("latir, rosnar");
		}
	}
	
	
	public void reagir (int idade ,double peso) {
		if(idade < 5 ) {
			if(peso < 10) {
				System.out.println("abanar");
			}else {
				System.out.println("latir");
			}
		}else {
			if(peso < 10 ) {
				System.out.println("rosnar");
			}else {
				System.out.println("ignorar");
			}
		}
	}

}