/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". 
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaFor04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		float numerador = 0;
		float denominador = 0;
		float resultado = 0;

		for (int i = 0; i < n; i++) {
			numerador = sc.nextFloat();
			denominador = sc.nextFloat();
			if (denominador == 0) {
				System.out.println("Divisao impossivel");
			} else {
				resultado = numerador/denominador;
				System.out.printf("%.1f", resultado);
			}
		}

		sc.close();
	}

}
