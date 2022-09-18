package aula17;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 14.Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */

public class Exe14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pares = 0;
		int impares = 0;
		int num;

		for (int i = 0; i < 10; i++) {   // digite 10 digitos
			System.out.println("Digite o numero :");
			num = sc.nextInt();

			if (num % 2 == 0) {   //Se num / 2 for igual a zero conta par senão conta impar
				pares++;
			} else {
				impares++;
			}

		}System.out.println("Quantidade pares " + pares) ; 
		 System.out.println( " Quantidade impares " + impares);
	}
		
}
