/*11.Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.
*/
package aula18VetoresArrays;

import java.util.Scanner;

public class Exe11 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		int [] vetorA = new int [10];
		
		for (int i=0; i<vetorA.length ; i++) {
			System.out.println("Entre com o valor do VetorA da posição: " +i);
			vetorA[i]= sc.nextInt(); 
		}
		
		int qtdPares = 0;
		for (int i=0; i<vetorA.length ; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares +=1;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " " );
		}
		System.out.println();
		
		System.out.println("Qtd números pares : " + qtdPares);
	}
	
	
}
