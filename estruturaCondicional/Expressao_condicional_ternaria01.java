/*
 * Estrutura opcional ao if-else quando se deseja decidir 
 * um VALOR com base em uma condição.
 */

package estruturaCondicional;

import java.util.Locale;

public class Expressao_condicional_ternaria01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		/*
		double preco = 34.5;
		double desconto;
		if (preco < 20) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * desconto * 0.05;
		}
		*/
		
		//ou
		
		double preco = 34.5;
		double desconto = (preco>20) ? preco * 0.1 : preco * 0.05;
	
		System.out.println(desconto);
	}

}
