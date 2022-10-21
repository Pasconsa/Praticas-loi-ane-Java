package aula17IfElseWhile;

import java.util.Scanner;

public class Exe00WhileDoWhile {

	public static void main(String[] args) {
		
		
		int i =1;
		int max = 10 ;
		
		System.out.println("Contando ate o max = " + max);
		
		while (i < max) {
			System.out.println("Valor de I = " + i);
			i++;
		}
		
		System.out.println("Valor momentaneo de I " + i);   //valor 10
		
		do {
			i++;
			System.out.println("Valor de i = " + i);   //valor 11
		}while (i < 10);
		
		System.out.println(i);
	
	}
}
