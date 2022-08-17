package com.java.revisao;

import java.util.Scanner;

public class Revisao_05 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		
		System.out.println("informe a nota do aluno");
		double notaAluno = scan.nextDouble();
		
		final boolean PASSOU_DE_ANO = notaAluno  >= 70;// constantes com Letras MAiusculas e separadas por anderline
		
		if(PASSOU_DE_ANO){
			System.out.println("Aluno Aprovado");
						
		}else {
			System.out.println("Aluno Reprovado");
		}
			
		
		 scan.close();
			
		
		
	}

}
