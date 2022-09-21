package aula17IfElseWhile;

import java.util.Scanner;

/*
 *18 Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.
 */
public class Exe18 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i<num; i++) {
			if(num% i == 0) {
				System.out.println("Não e primo");
				primo= false;
			}
		}
		
		if (primo) {
			System.out.println("e numero primo");
		}
	}

}
