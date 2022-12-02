package aula17IfElseWhile;

import java.util.Scanner;

/*12.Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo: */

public class Exe12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual numero deseja ver a tabuada");
		int n1 = sc.nextInt();
		
		for(int i = 1; i <=10 ; ++i) {
			System.out.println(i + "X" + n1 + "= " + (n1*i));
		}
	}

}
