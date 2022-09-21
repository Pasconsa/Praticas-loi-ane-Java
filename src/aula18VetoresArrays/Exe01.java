package aula18VetoresArrays;

import java.awt.print.Printable;
import java.util.Scanner;

/*1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i]. */

public class Exe01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length]; //04 equivalente o tamanho do vetor A
		
		for (int i=0; i<vetorA.length; i++) {  //01 loop para interar o array //02 posição do vetor começa com zero 03 I menor que o tamanho do vetor
			
			System.out.println("Entre com um valor da posicao: " +i);  
			vetorA[i]= scan.nextInt() ; //05 atribuição dos valores do vetor
			
			vetorB[i] = vetorA[i];  //06 atribuir os valores de A para B
			
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i]+" ");  //imprimir os valores do vetor A
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i]+" ");
		}
		System.out.println();
	}

}
