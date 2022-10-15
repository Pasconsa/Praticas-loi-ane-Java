/*
 * 3. Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.
 */

package aula20Matrizes;

import java.util.Scanner;

public class Exe03Matrizes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] [] numeros = new int [3] [3];
		
		for (int i=0; i<numeros.length ; i++) {
			for (int j=0; j< numeros[i].length ; j++) {
				
				System.out.println("Entre com o valor da pos [" + i + "," + j + "]");
				numeros[i] [j] = sc.nextInt();
			}
		}
	}
}
