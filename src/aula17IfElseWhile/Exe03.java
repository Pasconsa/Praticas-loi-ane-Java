package aula17IfElseWhile;

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
		
		Scanner sc = new Scanner(System.in);
		
		boolean infoValida = false;
		
		do {
			System.out.println("Entre com o nome ");
			String nome = sc.next();
			
			if(nome.length() >= 3) {
				infoValida = true;
			}else {
				System.out.println("Nome precisa no minimo de 3 caracteres.");
			}
		}while(!infoValida);
		
		
		
		infoValida = false;
		
		do {
			System.out.println("Entre com uma idade ");
			double idade = sc.nextDouble();
			
			if(idade >=0 && idade <=150) {
				infoValida = true;
			}else {
				System.out.println("escolha uma idade entre 0 a 150.");
			}
		}while(!infoValida);
		
	
	

	
infoValida = false;
	
	do {
		System.out.println("Digite o salario:");
		double salario = sc.nextDouble();
		
		if(salario > 0) {
			infoValida = true;
		}else {
			System.out.println("salario não pode ser menor que zero");
		}
	}while(!infoValida);
	
	
infoValida = false;
	
	do {
		System.out.println("Digite o sexo:");
		String sexo = sc.next();
		
		if(sexo.equalsIgnoreCase("f")  || sexo.equalsIgnoreCase("m")) {
			infoValida = true;
		}else {
			System.out.println("o sexo deve ser 'f' ou 'm'.");
		}
	}while(!infoValida);
	
	
	
	infoValida = false;
	
	do {
		System.out.println("Digite a primeira letra do estado civil");
		String estc = sc.next();
		
		if(estc.equalsIgnoreCase("s") || estc.equalsIgnoreCase("c") || estc.equalsIgnoreCase("v") || estc.equalsIgnoreCase("d")  ) {
			infoValida = true;
		}else {
			System.out.println("digite a primeira letra do xeu estado civil.");
		}
	}while(!infoValida);
	
	
	
}
	
	
}
