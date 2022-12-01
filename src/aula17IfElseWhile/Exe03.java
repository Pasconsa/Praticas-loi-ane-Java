package aula17IfElseWhile;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

/*
 * Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		boolean informValida = false;
	
	do {
	System.out.println("Coloque um nome :");
	String nome = sc.next();
	if(nome.length() > 3) {                        // Colcocar o tamanho do caractere do nome
		informValida = true;
	}else {
		System.out.println("Digite um nome maior que 3 caracteres");
	}
	} while (!informValida);
	
	
     
	informValida = false;   // a cada pergunta cria um novo bloolean
	
	do {
	System.out.println("Escreva uma idade entre 0 a 150 :");
	int idade = sc.nextInt();
	if (idade >= 0 && idade <= 150) {
		informValida = true;
	}else {
		System.out.println("Erro Escreva idade novamente");
	}
	}while (!informValida);
	
	
	informValida = false;
	do {
	System.out.println("Adiciona um salario");
	int sal = sc.nextInt();
	if (sal > 0 ) {
		informValida = true;
	}else {
		System.out.println("Digite um valo acima de zero");
	}
	}while (!informValida);
	
	
	
	informValida = false;
	 do {
	System.out.println("Digite o seu sexo F ou M :");
    String sex = sc.next();
   
    	if ( sex.equalsIgnoreCase("f") || sex.equalsIgnoreCase("m") ) {                                // colocar equals.ignoreCase para validar letra.
    		informValida = true;
    	}else {
    		System.out.println("o sexo deve ser F ou M");
    	}
    	}while (!informValida);
    
    
    informValida = false;
    do {
    System.out.println("Digite o estado civil s - c - v -d :");
    String est = sc.next();
    
	    if ( est.equalsIgnoreCase("s") || est.equalsIgnoreCase("c") || est.equalsIgnoreCase("v") || est.equalsIgnoreCase("d") ) {                                // colocar equals.ignoreCase para validar letra.
			informValida = true;
	    }else {System.out.println("Digitar  a letra do estado civil ");
		
	    	}
	
    	}while (!informValida);
	
	}
	
	
}
