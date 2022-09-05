package aula17;

import java.util.Scanner;

/*
 *ex15  A série de Fibonacci é formada pela seqüência
1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série
até o n−ésimo termo
 */

public class Exe15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o n-esimo termo da serie de fibonacci ");
		int n =sc.nextInt();
		
		int primeiro = 1;  //serie fibonacci é a soma dos dois ultimos numeros
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i=3; i<= n; i++) {  //vai se iniciar com termo 3
			
			proximo = primeiro + segundo;
			primeiro = segundo;   //primeiro numero passa  a ser o segundo numero
			segundo = proximo;		//segundo numero passa a ser o proximo
			
			System.out.println(proximo);
		}

			//respostas vão ser o numero e a quantidade de vezes com resultado

}
}
