package sintaxe_variaveis_e_fluxo;

public class ErroClarice {
	
	
	public static void main(String[] args) {
		int contador = 1;
		while (contador <= 10) {
			          
		    System.out.println(contador);
		    contador++;
				
		} 
	}
}

//Clarice chamou primeiro a variavel contador dentro do while e depois a clearou dentro do while,
//por isso o erro. Erro de escopo
