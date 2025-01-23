package atividades_Java;

import java.util.Locale;
import java.util.Scanner;

import atv1_ent.entidade1;

public class Atv1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		entidade1 retangulo = new entidade1();
		
		System.out.print("Informe a largura do retângulo: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Informe a altura do retângulo: ");
		retangulo.altura = sc.nextDouble();
		sc.close();
		System.out.println();
		System.out.println(retangulo);
	}

}
