/*
 * 21 Faça um programa que peça um número inteiro e determine se ele é
ou não um número primo. Um número primo é aquele que é divisível
somente por ele mesmo e por 1.
 */

package aula17;

import java.io.InvalidObjectException;
import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o numero de turmas:");
		int numTurmas = scan.nextInt();

		int numAlunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <=numTurmas; i++) {

			invalido = true;
			do {
				System.out.println("Entre com numero de alunos da turma" + i);
				numAlunos = scan.nextInt();

				if (numAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Numero de alunos invalidos digite novamente");
				}
			} while (invalido);
			soma += numAlunos;
		}
		double media = soma / numTurmas;
		System.out.println("média: " + media);
	}
}
