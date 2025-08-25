/* 
 * Fazer um programa para ler os valores da largura e altura de um retângulo. 
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. 
 * Usar uma classe como mostrado no projeto ao lado.
 */

package application02;

import java.util.Locale;
import java.util.Scanner;

import entities02.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		double areaRetangulo = retangulo.area();
		double perimetroRetangulo = retangulo.perimetro();
		double diagonalRetangulo = retangulo.diagonal();	
		
		System.out.printf("AREA = %.2f%n", areaRetangulo);
		System.out.printf("PERIMETRO = %.2f%n", perimetroRetangulo);
		System.out.printf("DIAGONAL = %.2f%n", diagonalRetangulo);
		
		
		sc.close();

	}

}
