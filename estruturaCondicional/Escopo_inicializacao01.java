package estruturaCondicional;

import java.util.Locale;

public class Escopo_inicializacao01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		double price = 400.00;
		// double discount = 0 sem o else;
		// ou com else: 
		double discount;
		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount= 0;
		}
		System.out.println(discount);
	}
	

}
