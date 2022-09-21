package aula17IfElseWhile;

import java.util.Scanner;

/*
 * 13.Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem
 */
public class Exe13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da base:");
		int base = sc.nextInt();
		
		System.out.println("Digite o numero do expoente:");
		int exp = sc.nextInt();
		
		int resultado = base;            // resultado iniciado com a base
		
		for (int i=1; i<exp; i++) {   //para 1 t ate menor que expoente conte 1
			resultado *= base;         // resulta vai ser multiplicado e igual a base
		}
		
		System.out.println("Resultado e = " + resultado);
	}

}
