package aula20Matrizes;

import java.util.Random;

/*
 * 1. Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-100. 
 *    Após isso determine o maior número da matriz 
 *    e a sua posição (linha, coluna)
 */
public class Exe01Matrizes {
	
	public static void main(String[] args) {
		 int [][] numerosAleatorios = new int[4][4];
		 
		 Random numeroRandom = new Random();
		 
		 //01 numero alatorio para a matriz
		 for(int i=0 ; i < numerosAleatorios.length ; i++) {       
			 for(int j=0 ; j< numerosAleatorios [i].length; j++) {  //02 array de arrays
				 numerosAleatorios [i][j]= numeroRandom.nextInt(100);  //03 vai gerar numero aleatorio de  0 a 100
			 }
		 }
		 
		 int maior = 0;
		 int linha =0;
		 int col = 0;
		 
		// 04 fazer a matriz novamente
		 for(int i=0 ; i < numerosAleatorios.length ; i++) {       
			 for(int j=0 ; j< numerosAleatorios [i].length; j++) {  
				if(numerosAleatorios[i] [j] > maior) {    //05 se  os numeros aleatorios da linha i e coluna j forem maior
					maior =  numerosAleatorios[i] [j];                               //06 então maior passa a receber esse valor
					linha = i;
					col = j;
				}
			 }
		 }
		 
		 //07 imprimir a matriz ja que são numeros random
		 for(int i=0 ; i < numerosAleatorios.length ; i++) {       
			 for(int j=0 ; j< numerosAleatorios [i].length; j++) {
				 System.out.print(numerosAleatorios[i] [j] + " ");
			 }
			 System.out.println();
			 
			 
		 }
		 System.out.println("maior valor = " + maior);
		 System.out.println("linha = " + linha);
		 System.out.println("coluna = " + col);
	}
}
