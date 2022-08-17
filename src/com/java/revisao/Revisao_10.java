package com.java.revisao;

import java.util.Scanner;

public class Revisao_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe sua idade e o tempo de contribui��o previd�nciaria: ");
		System.out.println("Sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Tempo de contribui��o com a Previd�ncia (em anos): ");
		int tempoContribuicao = scan.nextInt();

		if (idade >= 55 && tempoContribuicao >= 25) {
			System.out.println("Você ja pode dar entrada no pedido de aposentadoria");

		} else {
			System.out.println("Voc� ainda n�o preenche todos os requisitos para dar entrada na aposentadoria");
		}
		scan.close();

	}

}