package aula17;

import java.util.Scanner;

/*
 * 2. Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.
 */

public class Exe02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean validacao = false;
				
		do {
		
			System.out.println("Digite o Nome do Usuário ");
			String nomeDigitado = sc.next();
			
			System.out.println("Digite a Senha  ");
			String senhaDigitado = sc.next();
			
			if(nomeDigitado.equalsIgnoreCase(senhaDigitado)){
				validacao = false;
				System.out.println("Senha igual usuario digite novamente.");
			}else {
				validacao = true;
				System.out.println("Senha e usuarios validos");
			}
		}while(!validacao);
	

	}
	
}
