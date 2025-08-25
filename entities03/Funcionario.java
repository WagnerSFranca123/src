package entities03;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	public double percentual;

	public double salarioLiquido() {
		return salarioBruto-imposto;
	}

	public void aumentoSalarial(double percentual) {
		this.percentual = salarioLiquido() + (percentual * salarioBruto) / 100;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", percentual);
	}
}
