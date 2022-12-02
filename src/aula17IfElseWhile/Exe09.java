package aula17IfElseWhile;

/*Faça um programa que imprima na tela apenas os números ímpares
entre 1 e 50 */

public class Exe09 {

	public static void main(String[] args) {    //dividi por 2 o resto da zero é par , mas senão for par é impar
		
		for (int i = 1; i <=50 ; i++) {
			if(!(i % 2 == 0)) {
				System.out.println(i);
			}
			
		}
	}
	
}
