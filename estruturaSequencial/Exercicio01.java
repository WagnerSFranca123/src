/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
 * mensagem explicativa, conforme exemplos.
 * 
 * */


package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a+b;
		
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
