/*
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
 * indeterminada de pontos no sistema cartesiano. 
 * Para cada ponto escrever o quadrante a que ele pertence. 
 * O algoritmo será encerrado quando pelo menos uma de 
 * duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

package estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();

	}

}
