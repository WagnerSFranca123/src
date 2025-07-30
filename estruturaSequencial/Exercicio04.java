/*
 * Fazer um programa que leia o número de um funcionário, 
 * seu número de horas trabalhadas, o valor que recebe por 
 * hora e calcula o salário desse funcionário. A seguir, 
 * mostre o número e o salário do funcionário, com duas casas
 * decimais.
 * 
 * */


package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario =sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = horas*valor;
		
		System.out.println("Number = "+funcionario);
		System.out.printf("Salary = %.2f%n", salario);
		
		sc.close();
		
	}

}
