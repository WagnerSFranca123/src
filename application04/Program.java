/* Fazer um programa para ler o
 * nome de um aluno e as três
 * notas que ele obteve nos três
 * trimestres do ano (primeiro trimestre 
 * vale 30 e o segundo e terceiro valem 35 cada).
 * Ao final, mostrar qual a nota final do aluno no ano.
 * Dizer também se o aluno está aprovado (PASS) 
 * ou não (FAILED) e, em caso negativo,
 * quantos pontos faltam para o aluno 
 * obter o mínimo para ser aprovado (que é 60% da nota). 
 * Você deve criar uma classe Studentpara resolver este problema. 
 */

package application04;

import java.util.Locale;
import java.util.Scanner;

import entities04.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		aluno.nome = sc.nextLine();
		aluno.nota01 = sc.nextDouble();
		aluno.nota02 = sc.nextDouble();
		aluno.nota03 = sc.nextDouble();
		
		System.out.println("Nota Final: " + aluno.notaFinal());
		System.out.println(aluno);
		
		
		
		sc.close();
	}

}
