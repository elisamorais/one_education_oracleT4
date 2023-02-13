package sintaxe_variaveis_e_fluxo;

public class TestaValores {
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		//quanto vale o segundo afinal?
		// no java não há sobrescrição de valores de variaveis, o que vale é a primeira
		//declaração.
		
		System.out.println(segundo);
		
	}

}
