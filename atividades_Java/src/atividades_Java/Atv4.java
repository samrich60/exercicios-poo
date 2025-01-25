package atividades_Java;

import java.util.Locale;
import java.util.Scanner;

import atv1_ent.entidade4;

public class Atv4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats is the dollar price? ");
		double dolar = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double reais = sc.nextDouble();
		sc.close();
		double valor_real = entidade4.soma(dolar, reais);
		
		System.out.printf("Amount to be paid in reais: %.2f%n",valor_real);
	}

}
