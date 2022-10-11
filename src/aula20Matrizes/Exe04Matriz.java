/*
 * 4. Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.
 */

package aula20Matrizes;

import java.util.Scanner;

public class Exe04Matriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] [] compromissos = new String [31] [24];
		
		
		boolean sair = false;   //01 enquanto for verdadeiro pede informações ao usuario
		byte opcao;
		while (!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) { //adicionar compromisso
			
			} else if ( opcao == 2) {  //verificar compromisso
				
			} else if ( opcao == 0) {
				sair = true;
				
			}else {
				System.out.println("Opção invalida digite novamente");
			}
		}
	}
}
