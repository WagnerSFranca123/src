/*
 * Ler um número inteiro N e calcular todos os seus divisores. 
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			if (n % i == 0) {
				System.out.println(n / i);
			}
			sc.close();
		}
	}
}
