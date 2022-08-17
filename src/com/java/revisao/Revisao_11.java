package com.java.revisao;

import java.util.Scanner;

public class Revisao_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		 final double NOTA_MINIMA = 60;
		
		System.out.println("Informe a nota da matéria de Português ");
		double notaPortugues = scan.nextInt();
		
		System.out.println("Informe a nota da matéria de Matematica ");
		double notaMatematica = scan.nextInt();
		
				
		boolean notaDeCorte = notaPortugues>= NOTA_MINIMA && notaMatematica >= NOTA_MINIMA;
		
		double notaFinal= notaPortugues+ notaMatematica;
		
		if(notaFinal >= 150 && notaDeCorte) {
			System.out.println("Aluno Aprovado");
		} else {
			System.out.println("Aluno Reprovado");
		}
		
		scan.close();
	}

}