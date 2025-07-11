/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos 
 * tem a preferência de seus clientes. Escreva um algoritmo para 
 * ler o tipo de combustível abastecido (codificado da seguinte 
 * forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
 * Caso o usuário informe um código inválido 
 * (fora da faixa de 1 a 4) deve ser solicitado um novo código
 * (até que seja válido). O programa será encerrado quando o 
 * código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO"
 * e a quantidade de clientes que abasteceram cada tipo de combustível, 
 * conforme exemplo.
 * 
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		int combustivel = sc.nextInt();

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool += 1;
				combustivel = sc.nextInt();
			} else if (combustivel == 2) {
				gasolina += 1;
				combustivel = sc.nextInt();
			} else if (combustivel == 3) {
				diesel += 1;
				combustivel = sc.nextInt();
			} else {
				combustivel = sc.nextInt();
			}
		}
		System.out.printf("Muito obrigado%n");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);

		sc.close();
	}

}
