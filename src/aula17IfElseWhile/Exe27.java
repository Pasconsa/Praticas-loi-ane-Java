/*
 * 27 Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos
 */

package aula17IfElseWhile;

import java.util.Scanner;

public class Exe27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de turmas:");
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		
		
		boolean valido = false;
		for (int i = 1; i <=numTurmas; i++) {

			valido = true;
			do {
				System.out.println("Entre com numero de alunos da turma" + i);
				numAlunos = scan.nextInt();

				if (numAlunos <= 40) {
					valido = false;
				} else {
					System.out.println("Numero de alunos invalidos digite novamente");
				}
			} while (valido);
			soma += numAlunos;
		}
		double media = soma / numTurmas;
		System.out.println("média: " + media);
	}
}
