package atv1_ent;

public class entidade3 {
	public String nome;
	public double nota1, nota2,nota3;
	
	public double Soma () {
		return nota1 + nota2 + nota3;
	}
	public double media () {
		return 60 - Soma();
	}
	public String toString() {
		String Resultado = "Nota Final: " + Soma() + "\n";
		if (Soma()>60) {
			Resultado += "Situação: Aprovado";
		}
		else {
			Resultado +="Situação: Nota abaixo da media\n";
			Resultado += "Pontos que faltando: " + media() + "\n";
		}
		return Resultado;
		}	
}
