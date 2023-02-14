package sintaxe_variaveis_e_fluxo;

public class TestaWhile {
	public static void main(String[] args) {
		int contador = 0;
		while(contador <= 10) {
			System.out.println(contador);
			//contador = contador + 1; - essas duas linhas comentadas são equivalentes
			//contador += 1;
			++contador;
		}
		System.out.println(contador);
		
	}

}
