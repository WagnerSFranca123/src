package topicosBasicos;

import java.util.Locale;

public class Exemplo01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}
