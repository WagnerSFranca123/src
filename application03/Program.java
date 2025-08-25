
/*
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). 
 * Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada 
 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
 * Use a classe projetada abaixo.
 */

package application03;

import java.util.Locale;
import java.util.Scanner;

import entities03.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
	
		Funcionario funcionario = new Funcionario();
		System.out.print("Name: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();		
		
		System.out.print("Imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.print("Funcionario: " + funcionario.nome + ", $ " + funcionario.salarioLiquido());
		
		System.out.println();
		System.out.print("Qual a porcentagem de aumento do salario? ");
		double percentual = sc.nextDouble();
		funcionario.aumentoSalarial(percentual);
		
		System.out.println();
		System.out.println("Update data: " + funcionario);
		
		sc.close();
	}

}
