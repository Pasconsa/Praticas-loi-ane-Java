package aula17;
/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int soma = 0;
		double media;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um numero");
			num = sc.nextInt();

			soma += num;

		}
		media = soma / 5;
		System.out.println("Soma " + soma);
		System.out.println("Media " + media);
	}

}
