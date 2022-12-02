package aula17IfElseWhile;
/*Altere o programa anterior para mostrar no final a soma dos números*/

import java.util.Scanner;

public class Exe11 {


		public static void main(String[] args) {
			
		Scanner sc = new Scanner (System.in);
		
		int soma = 0;
			
		System.out.println("Digite dois numeros");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int i = n1 ; i <= n2; i++) {
			soma += i;
			
		
		}
		System.out.println(soma);
		}
		
}
