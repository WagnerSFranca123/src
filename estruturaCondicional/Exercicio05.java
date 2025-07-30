/*
 * Com base na tabela abaixo, escreva um programa 
 * que leia o código de um item e a quantidade deste item.
 * A seguir, calcule e mostre o valor da conta a pagar.
 */

package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double codigo = sc.nextDouble();
		int quantidade = sc.nextInt();
		if (codigo == 1) {
			double preco = quantidade * 4;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (codigo == 2) {
			double preco = quantidade * 4.5;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (codigo == 3) {
			double preco = quantidade * 5;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (codigo == 4) {
			double preco = quantidade * 2;
			System.out.printf("Total: R$ %.2f%n", preco);
		} else if (codigo == 5) {
			double preco = quantidade * 1.5;
			System.out.printf("Total: R$ %.2f%n", preco);
		}

		sc.close();
	}

}
