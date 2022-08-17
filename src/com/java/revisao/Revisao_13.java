package com.java.revisao;

import java.util.Scanner;

public class Revisao_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero de 1 a 7:\n");
		int diaDaSemana = scan.nextInt();

		String dia = null;

		switch (diaDaSemana) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda-Feira";

			break;

		case 3:
			dia = "Terça-feira";

			break;

		case 4:
			dia = "Quarta-Feira";

			break;

		case 5:
			dia = "Quinta-Feira";

			break;

		case 6:
			dia = "Sexta-feira";

			break;

		case 7:
			dia = "Sabado";

			break;
		default: dia="Invalido";
			

		}
		System.err.println("Escolha um numero DE 1 ATÉ 7");
		System.out.println("Você escolheu " + dia);
		scan.close();
	}

}