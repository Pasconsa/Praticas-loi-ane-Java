package aula17IfElseWhile;

import java.util.Scanner;

public class Exe00SwitchCase {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		int diaSemana;
	
		System.out.println("Digite um dia da semana 1-7");
		diaSemana = scanner.nextInt();
		
		switch (diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sabado"); break;
		
		default:System.out.println("Não é um dia valido");
			
		}
		
	}
}

	

