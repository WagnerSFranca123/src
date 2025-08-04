/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
 * de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
 * peso 5.
 *
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		float valor01 = 0;
		float valor02 = 0;
		float valor03 = 0;
		float media = 0;

		for (int i = 0; i != n; i++) {
			valor01 = sc.nextFloat();
			valor02 = sc.nextFloat();
			valor03 = sc.nextFloat();
			media = (valor01 * 2 + valor02 * 3 + valor03 * 5) / 10;
			System.out.printf("%.1f%n", media);
		}

		sc.close();

	}
}
