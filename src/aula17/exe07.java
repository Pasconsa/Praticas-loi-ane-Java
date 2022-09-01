package aula17;

import java.util.Scanner;

/*07 Faça um programa que leia 5 números e informe o maior número*/

public class exe07 {

public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	int num;
	
	int maior = Integer.MIN_VALUE;
	
	for(int i=0; i<5; i++) {
	
	System.out.println("Digite os numeros");
	 num =sc.nextInt();
	 
	 if(num > maior) {
		 maior = num;
	 }
}
	System.out.println("O maior numero digitado foi: " + maior);
	}


}
