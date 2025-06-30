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
		double imposto3;
		double resto;
		double total;

		if (salario < 2000) {
			System.out.println("Isento");
		} else if (salario < 3000) {
			imposto1 = (salario - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", imposto1);
		} else if (salario < 4500) {
			resto = salario - 3000;
			imposto1 = resto * 0.18;
			imposto2 = (1000) * 0.08;
			total = imposto1 + imposto2;
			System.out.printf("R$ %.2f%n", total);
		} else {
			resto = salario - 4500;
			imposto1 = resto * 0.28;
			imposto2 = (salario - resto - 3000) * 0.18;
			imposto3 = (1000) * 0.08;
			total = imposto1 + imposto2 + imposto3;
			System.out.printf("R$ %.2f%n", total);
		}

		sc.close();

	}

}
