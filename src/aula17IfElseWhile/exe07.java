package aula17IfElseWhile;


import java.util.Scanner;

/*07 Faça um programa que leia 5 números e informe o maior número*/

public class exe07 {

public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);

double num ;

double max = Integer.MIN_VALUE;            // min_value = menor valor possivel

for(int i =0; i < 5 ; i++) {

System.out.println("Digite o numero");

num = sc.nextInt();

if(num > max) {  //se o numero for maior que a variavel max então maior vai ser o numero
	num = max;
}


}System.out.println("O valor maximo = " + max);
	
	}


}
