package aula17IfElseWhile;

import java.util.Scanner;

/*5. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação*/

public class Exe05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int popA;
		int popB;
		double taxA;
		double taxB;
	

		boolean valido = false;
		do {

			System.out.println("Digite o valor da populacao A: ");
			popA = sc.nextInt();

			if (popA > 0) {
				valido = true;
			} else {
				System.out.println("População A precisa ser maior que zero");
			}
		} while (!valido);
		
		
		
		valido = false;
		do {

			System.out.println("Digite o valor da populacao B: ");
			popB = sc.nextInt();

			if (popB > 0) {
				valido = true;
			} else {
				System.out.println("População B precisa ser maior que zero");
			}
		} while (!valido);
		
		
		
		valido = false;
		do {

			System.out.println("Digite o valor da taxa A: ");
			taxA = sc.nextDouble();

			if (taxA > 0) {
				valido = true;
			} else {
				System.out.println("Taxa precisa ser maior que zero");
			}
		} while (!valido);
		
		
		valido = false;
		do {

			System.out.println("Digite o valor da taxa B: ");
			taxB = sc.nextDouble();

			if (taxB > 0) {
				valido = true;
			} else {
				System.out.println("Taxa precisa ser maior que zero");
			}
		} while (!valido);

		double contAno=0;
		

		while (popA < popB) {

			popA += (popA / 100) * taxA;
			popB += (popB / 100) * taxB;
			contAno++;
		}

		System.out.println("Populacao A: " + popA);
		System.out.println("Populacao B: " + popB);
		System.out.println("Quantos anos: " + contAno);

	}
}
