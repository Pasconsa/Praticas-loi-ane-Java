package aula19VetoresArrays;

public class Exe00Vetores {
	
	public static void main(String[] args) {

	double [] temperaturas = new double [3];
	
	temperaturas [0] = 32.5;
	temperaturas [1] = 33;
	temperaturas [2] = 35;
	
	for(int i=0 ; i < temperaturas.length ; i++) {
		System.out.println("O valor da temperatura " + (i+1) + " e " + temperaturas[i]);
	}
	
	
	
	}

}
