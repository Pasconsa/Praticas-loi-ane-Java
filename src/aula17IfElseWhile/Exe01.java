package aula17IfElseWhile;

import java.util.Scanner;

/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido. */

public class Exe01 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	boolean notaValida = false;
	
	do {
	System.out.println("Escolha uma nota de 0 a 10 ");
	int nota = sc.nextInt();
	
	if(nota >= 0 && nota <=10) {
		notaValida = true;
		System.out.println("nota valida");
	}else {
		System.out.println("nota invalida");
	}
	
	} while(notaValida == false);
	
	
	}

}