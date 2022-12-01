package aula17IfElseWhile;

/*
 * Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.
 */
public class Exe04 {

	public static void main(String[] args) {

	double popA = 80000;
	double popB = 200000;
	double contAno = 0;
	
	while(popA < popB) {
		
		popA += popA * 0.03;
		popB += popB * 0.015;
		
		contAno ++;
		
	
		
	}
	System.out.println("Populacao A: " + popA);
	System.out.println("Populacao B: " + popB);
	System.out.println("Quantos anos: " + contAno);

	
	}
}