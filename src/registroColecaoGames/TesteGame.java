package registroColecaoGames;

import java.util.Set;

public class TesteGame {

	public static void main(String[] args) {
		
		Console cs1 = new Console ();  //instancai com construtor vazio
		cs1.setNome("Super Nintendo");
		cs1.setMarca("Nintendo");
		cs1.setAnoLancamento(1990);   
		cs1.setGeraçao(4);
		cs1.setTipoMidia(Midia.FITA);
		
		
		Console cs2 = new Console ();
		cs2.setNome("Playstation");
		cs2.setMarca("Sony");
		cs2.setAnoLancamento(1994);   
		cs2.setGeraçao(5);
		cs2.setTipoMidia(Midia.CD);
		
		Game g1 = new Game("Street Fighter 2", "Capcom", 1992);  //usando construtor com parametros
		
	
		
		
		System.out.println("Nome console : " + cs2.getNome());
		System.out.println("Calcular tempo : " + cs2.calcularAnos() + " anos");  
		
		System.out.println();
		
		System.out.println("Nome console : " + cs1.getNome());
		System.out.println("Calcular tempo : " + cs1.calcularAnos(2022, 1990) + " anos");  //resposta obtida metodo retorno com parametros
		
		System.out.println();
		
		System.out.println("Nome do Game : " + g1.getNome());
		System.out.println("Produtora : " + g1.getProdutora()); 
		System.out.println("Ano lancameto : " + g1.getAnoLancamento());
		
	}
	
}
