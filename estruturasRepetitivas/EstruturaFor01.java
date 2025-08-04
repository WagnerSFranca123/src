/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X,
 * um valor por linha, inclusive o X, se for o caso.
 * 
 * */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x <= 1 || x <= 1000) {
			for (int i = 1; i <= x; i++) {
					System.out.println(i);
					i += 1;
				}
			}
		sc.close();

	}

}
