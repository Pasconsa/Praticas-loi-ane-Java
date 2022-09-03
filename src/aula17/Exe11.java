package aula17;
/*Altere o programa anterior para mostrar no final a soma dos números*/

import java.util.Scanner;

public class Exe11 {


		public static void main(String[] args) {
			
			Scanner sc =new Scanner(System.in);
			
			int n1;
			int n2;
			int soma=0;
			
			System.out.println("Entre com o primeiro numero");
			n1 = sc.nextInt();
			
			System.out.println("Entre com o segundo numero");
			n2 = sc.nextInt();
			
			for (int i=n1; i<=n2; i++) {
				soma += i;
				
			}System.out.println("Soma " + soma);
		}
		
	

	
}
