package aula17IfElseWhile;

import java.util.Scanner;

public class Exe00IfElseExemplo {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		int valor;
	
		System.out.println("Digite o valor da passagem");
		valor = scanner.nextInt();
		
		if(valor < 10){
			System.out.println("Barato");
		}else if(valor < 15) {
			System.out.println("pedir desconto");
		}else if(valor < 17) {
			System.out.println("pesquisar mais");
		}else {
			System.out.println("Caro");
		
		}
	}
}
