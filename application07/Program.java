package application07;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		String holder = sc.next();
		System.out.println("Is therena initial deposit (y/n)? ");
		boolean yes_no =sc.hasNext();
		
		
		
		sc.close();
		
	}

}
