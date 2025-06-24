/*
 * Leia a hora inicial e a hora final de um jogo. 
 * A seguir calcule a duração do jogo, 
 * sabendo que o mesmo pode
 * começar em um dia e terminar em outro, 
 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();

		if (inicio < 24 && fim < inicio) {
			int duracao = (24 - inicio) + fim;
			System.out.printf("O jogo durou %d hora(s)", duracao);
		} else if (inicio == fim) {
			System.out.println("O jogo durou 24 hora(s)");
		} else if (inicio < 24 && fim > inicio) {
			int duracao = fim-inicio;
			System.out.printf("O jogo durou %d hora(s)", duracao);
		}

		sc.close();

	}

}
