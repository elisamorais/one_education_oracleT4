package sintaxe_variaveis_e_fluxo;

public class TesteSomatoria {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while(contador <=10) {
			total = total + contador; //ou total += contador é a mesma coisa
			contador++;
		}
		System.out.println(total);
		
	}

}
