package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto1;
		double imposto2;
		double total;

		if (salario < 2000) {
			System.out.println("Isento");
		} else if (salario < 3000) {
			imposto1 = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", imposto1);
		} else if (salario < 4500) {
			imposto1 = (salario - 3000) * 0.18;
			imposto2 = (salario - 2000) * 0.08;
			total = imposto1+imposto2;
			System.out.printf("R$ %.2f%n", total);
		} else {
			imposto1 = (salario - 4500) * 0.28;
			System.out.printf("R$ %.2f%n", imposto1);
		}

		sc.close();

	}

}
