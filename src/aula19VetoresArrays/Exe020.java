/*
 * 20.Implementar um programa que obtenha a cotação do dólar (U$) em
		relação ao real (R$) 
		e a seguir armazene em vetor A com 20 elementos as seguintes conversões:
	21.A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
 */

package aula19VetoresArrays;

import java.util.Scanner;

public class Exe020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in)	;
		
		double[] vetorA = new double [20];
		double cotacao;
		
		System.out.println("Entre com a cotação do dólar:");
		cotacao = sc.nextDouble();
		
		for (int i=0; i<vetorA.length; i++) {
			vetorA[i]= cotacao * i;
			
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " " );
		}
		System.out.println();
	}
}
