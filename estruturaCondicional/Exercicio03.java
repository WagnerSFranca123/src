/*
 * Leia 2 valores inteiros (A e B). 
 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
 * "Nao sao Multiplos", indicando se os valores lidos são 
 * múltiplos entre si. Atenção: os números devem poder ser digitados em
 * ordem crescente ou decrescente.
 */

package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a < b && b % a == 0) {
			System.out.println("Sao multiplos");
		} else if (a > b && a % b == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();

	}

}
