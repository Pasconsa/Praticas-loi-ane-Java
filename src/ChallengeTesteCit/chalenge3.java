package ChallengeTesteCit;

import java.util.List;

public class chalenge3 {
	
	public static String calculaValor(Integer number) {
		return number >= 5 ? "1" : "0";	
	}
	
	 public static Integer calculaNumeroDaSenha(List<String> senha) {
		 String valorSenha = null;
		 Integer col0 = 0;
		 Integer col1 = 0;
		 Integer col2 = 0;
		 Integer col3 = 0;
		 Integer col4 = 0;
		 Integer col5 = 0;
		 Integer col6 = 0;
		 Integer col7 = 0;
		 Integer col8 = 0;
		 Integer col9 = 0;
			

		 for (String linha: senha) {
		   Integer col0Atual = Integer.parseInt(String.valueOf(linha.charAt(0)));
		   col0 += col0Atual;
		   
		   Integer col1Atual = Integer.parseInt(String.valueOf(linha.charAt(1)));
		   col1 += col1Atual;
		   
		   Integer col2Atual = Integer.parseInt(String.valueOf(linha.charAt(2)));
		   col2 += col2Atual;
		   
		   Integer col3Atual = Integer.parseInt(String.valueOf(linha.charAt(3)));
		   col3 += col3Atual;
		   
		   Integer col4Atual = Integer.parseInt(String.valueOf(linha.charAt(4)));
		   col4 += col4Atual;
		   
		   Integer col5Atual = Integer.parseInt(String.valueOf(linha.charAt(5)));
		   col5 += col5Atual;
		   
		   Integer col6Atual = Integer.parseInt(String.valueOf(linha.charAt(6)));
		   col6 += col6Atual;
		   
		   Integer col7Atual = Integer.parseInt(String.valueOf(linha.charAt(7)));
		   col7 += col7Atual;
		   
		   Integer col8Atual = Integer.parseInt(String.valueOf(linha.charAt(8)));
		   col8 += col8Atual;
		   
		   Integer col9Atual = Integer.parseInt(String.valueOf(linha.charAt(9)));
		   col9 += col9Atual;
		 }
		 
		 valorSenha = calculaValor(col0) + calculaValor(col1) + calculaValor(col2) + calculaValor(col3) + 
				 calculaValor(col4) + calculaValor(col5) + calculaValor(col6) + calculaValor(col7) + calculaValor(col8) + calculaValor(col9); 
		 
		 
	    
		 return Integer.parseInt(valorSenha, 2);
	}

}
