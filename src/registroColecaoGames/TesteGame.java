package registroColecaoGames;

import java.util.Set;

public class TesteGame {

	public static void main(String[] args) {
		
		Console cs1 = new Console ("Super Nintendo", "Nintendo", 1990, Midia.FITA, 4);  //instancia usando construtor com parametros
		
		
		Console cs2 = new Console ();  //instancia com construtor vazio
		cs2.setNome("Playstation");
		cs2.setMarca("Sony");
		cs2.setAnoLancamento(1994);   
		cs2.setGeracao(5);
		cs2.setTipoMidia(Midia.CD);
		
		
		
// instancia de games
		
		Game g1 = new Game();
		g1.setNome("Street fighter 2");
		g1.setProdutora("Capcom");
		g1.setAnoLancamento(1992);   
		g1.setGenero("Luta");
		g1.setTipoMidia(Midia.FITA);
		
		
		Game g2 = new Game();
		g2.setNome("Batman returns");
		g2.setProdutora("Konami");
		g2.setAnoLancamento(1993);   
		g2.setGenero("Acao");
		g2.setTipoMidia(Midia.FITA);
		
		
		try {	                                       //adicionado estrutura try catch excessão
			
		//array setar na classe Console os games
		Game[] games = new Game[1];
		games[0] = g1;
		games[1] = g2;
		
		
		
		//Impressão Arrays setar na classe Console os games 1 para muitos
		
		System.out.println(" associacao 1 console tem muitos games = " + cs1.getNome());
		System.out.println();
		
		cs1.setGames(games);
			if (cs1 != null && cs1.getGames() != null) {            
				for(Game g : cs1.getGames()) {
					System.out.println(g.getNome() +" " + g.getGenero());
				}
			}
		
		}catch (ArrayIndexOutOfBoundsException exception) {									//adicionado estrutura  catch excessão
			System.out.println("Excessão ao acessar indce do vetor que não existe");
		}
			
			System.out.println("---------------------------");
		
		//Impressão
		
		System.out.println("Nome console : " + cs2.getNome());
		System.out.println("Calcular tempo : " + cs2.calcularAnos() + " anos");  
		
		System.out.println();
		
		System.out.println("Nome console : " + cs1.getNome());
		System.out.println("Calcular tempo : " + cs1.calcularAnos(2022, 1990) + " anos");  //resposta obtida metodo retorno com parametros
		
		System.out.println();
		
		System.out.println("---------- Lista games ---------------");
		
		System.out.println(g1);   //impressão to string
		System.out.println();
		System.out.println(g2);
	}
	
}
