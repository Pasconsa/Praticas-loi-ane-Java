package aula17IfElseWhile;


import java.util.Scanner;

/*
 * 14.Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.
 */

public class Exe14 {

	public static void main(String[] args) {
		
		int pares = 0 ;
		int impares = 0;

		Scanner sc = new Scanner(System.in);

		for( int i = 1 ; i <=10 ; i++) {
			System.out.println("Digite o numero " + i  );
			int num = sc.nextInt();
			
			if(num % 2 == 0){                        //Se num / 2 for igual a zero conta par senão conta impar
				 pares ++;
				
			}else impares ++;
			
		}System.out.println("mostrar numeros pares = " + pares);
		System.out.println("mostrar numeros impares = " + impares);
	}
		
}
