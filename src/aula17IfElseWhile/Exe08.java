package aula17IfElseWhile;
/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num ;
		int soma = 0 ;
		double med = 0;
		
		for (int i=0; i < 5; i++) {
			System.out.println("Digite o numero ");
			num = sc.nextInt();
			
			soma += num;	
			
		}
		med = soma / 5;
		
		System.out.println("soma = " + soma);
		System.out.println("media = " + med);
		
	}

}
