package aula17IfElseWhile;


import java.util.Scanner;

/*Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/

public class Exe10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Digite dois numeros");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i = n1 ; i <= n2 ; i++ ) {
			System.out.println(i);
		}
		
	}
	
	
}
