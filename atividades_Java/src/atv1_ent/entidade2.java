package atv1_ent;

public class entidade2 {

	public String nome;
	public double salarioBruto, porcentagemAdd;
	
	
	public void salarioMimposto(double imposto) {
		 salarioBruto -= imposto ;
	}
	
	public void salarioAdd(double add) {
		salarioBruto += (salarioBruto * (add/100));
	}
	
	public String toString () {
		return nome
		+ ", R$"
		+ salarioBruto;
	}
}
