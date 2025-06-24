package estruturaSequencial;

public class FormulaBaskara01 {

	public static void main(String[] args) {
		
		double delta, a=2.0, b=3.0, c=-2.0, x1, x2;
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta))/(2.0*a);
		x2 = (-b - Math.sqrt(delta))/(2.0*a);
		System.out.println(delta);
		System.out.println(x1);
		System.out.println(x2);
	}

}
