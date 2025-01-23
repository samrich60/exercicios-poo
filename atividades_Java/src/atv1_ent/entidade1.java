package atv1_ent;

public class entidade1 {
	public double largura;
	public double altura;
	
	public double area () {
		return largura * altura;
	}
	public double perimetro () {
		return 2 * (largura + altura);
	}
	public double diagonal () {
		 return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	public String toString() {
		return "Area = " 
		+ String.format("%.2f%n", area())
		+ "Perimetro = "
		+ String.format("%.2f%n", perimetro())
		+ "Diagonal = "
		+ String.format("%.2f%n", diagonal());
	}
}
