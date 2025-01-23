package atividades_Java;

import java.util.Locale;
import java.util.Scanner;

import atv1_ent.entidade3;

public class Atv3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		entidade3 dadosn = new entidade3();
		
		System.out.println("Preencha os capos abaixo com seus dados");
		System.out.print("Nome do(a) Estudante: ");
		dadosn.nome = sc.nextLine();
		
		System.out.println();
		System.out.println("Informe a nota obtida em cada Sametre");
		System.out.print("1° Semestre: ");
		dadosn.nota1 = sc.nextDouble();
		System.out.print("2° Semestre: ");
		dadosn.nota2 = sc.nextDouble();
		System.out.print("3° Semestre: ");
		dadosn.nota3 = sc.nextDouble();
		sc.close();

		System.out.println();
		System.out.println(dadosn);
	}

}
