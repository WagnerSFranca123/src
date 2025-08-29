package util01;

public class ConversorMoeda {
	
	public static final double IOF = 0.06;
	
	public static double calcDollarToReal(double dollar, double quant) {
		return dollar * quant * IOF + dollar * quant;
	}
}
