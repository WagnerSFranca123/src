/* 
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
 * o valor unitário de cada peça 1, o 
 * código de uma peça 2, o número de peças 2 e o valor 
 * unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 * 
 * */

package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = sc.nextDouble();
		int codigo1 = sc.nextInt();
		int quantidade1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		double pagamento = quantidade*valor+quantidade1*valor1;
		System.out.printf("%d + %d Valor a pagar: R$ %.2f%n",codigo, codigo1, pagamento);
		
		sc.close();

	}

}
