package entities04;

public class Aluno {
	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	public String aprovacao;

	public double notaFinal() {
		return  (nota01 + nota02 + nota03);

	}

	public String toString() {
		if (notaFinal() > 60) {
			return aprovacao = "Passou";
		} else {
			return aprovacao = "Reprovado -" + " Falta(m) " + (60 - notaFinal())+ " ponto(s)";
		}

	}
}
