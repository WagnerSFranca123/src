package application06;

import java.util.Locale;
import java.util.Scanner;

import util01.ConversorMoeda;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do Dolar? ");
		double dollar = sc.nextDouble();
		System.out.print("Qual a quantidade de Dolar a comprar? ");
		double quant = sc.nextDouble();
		System.out.printf("Valor em reais = %.2f%n", ConversorMoeda.calcDollarToReal(dollar, quant));
		
		sc.close();

	}

}
