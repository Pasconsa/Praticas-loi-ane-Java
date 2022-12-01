package aula17IfElseWhile;

import java.util.Scanner;

/*
 * 2. Faça um programa que leia um nome de usuário e a sua senha 
 * e não aceite a senha igual ao nome do usuário, 
 * mostrando uma mensagem de erro 
 *  e voltando a pedir as informações.
 */

public class Exe02 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean foremIguais = false;
		
	do {	
		
	System.out.println("Digite o nome ");
	String nome = sc.next();
	
	System.out.println("Digite o senha ");
	String senha = sc.next();
	
		if (senha.equalsIgnoreCase(nome)) {
			
			System.out.println("Erro login igual a senha invalido");
			
		}else { System.out.println("Senha e login diferentes valido");
			foremIguais = true;
		}
		
	}while(foremIguais == false);

	}
	
}
