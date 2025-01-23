package atividades_Java;

import java.util.Locale;
import java.util.Scanner;

import atv1_ent.entidade2;

public class Atv2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		entidade2 dados = new entidade2();
		
		System.out.println("Preencha abaixo com seu dados");
		System.out.print("Nome: ");
		dados.nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
		dados.salarioBruto = sc.nextDouble();
		System.out.print("Valor do Imposto: ");
		double imposto =  sc.nextDouble();
		dados.salarioMimposto(imposto);
		
		System.out.println();
		System.out.println("Dados Informados: " + dados);
		System.out.print("Qual a porcentagem de aumeto do salario? ");
		double adicional = sc.nextDouble();
		dados.salarioAdd(adicional);
		sc.close();
		System.out.println();
		System.out.println("Dados Atualizados: " + dados);
	}

}
