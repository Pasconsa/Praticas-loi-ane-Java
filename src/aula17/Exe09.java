package aula17;

/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50 */

public class Exe09 {

	public static void main(String[] args) {
		
		for (int i=1 ; i <= 50; i++) {
			
			if(i % 2 != 0) {  //dividi por 2 o resto da zero é par , mas senão for par é impar
		
			System.out.println( i);
			}
		}
	}
	
}
