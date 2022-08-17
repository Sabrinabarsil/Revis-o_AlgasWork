package com.java.revisao;

import java.util.Scanner;

public class Revisao_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o seu Peso (Kg) e Altura (Metros) :");
		Double peso = scan.nextDouble();
		Double altura = scan.nextDouble();

		Double IMC = peso / (altura * altura);
		System.out.printf("%.1f", IMC);

		if (IMC < 18.5) {
			System.out.println("\n Seu Peso est� baixo do normal, procure orienta��o m�dica");
		} else if (18.5 < IMC && IMC <= 24.9) {
			System.out.println("\n Seu Peso est� Normal");
		}

		else if (25 <= IMC && IMC <= 29.9) {
			System.out.println("\n Voc� est� com Sobrepeso. Aten��o!");
		}

		else if (30 <= IMC && IMC <= 34.9) {
			System.out.println("\n Voc� est� com Obesidade Grau I, aconselhamos que procure um profissional!");
		}

		else if (35 <= IMC && IMC <= 39.9) {
			System.out.println("\n Voc� est� com Obesidade Grau II, aconselhamos que procure um profissional!");
		}

		else if (40 > IMC) {
			System.out.println(
					"\n Voc� est� com Obesidade Grau III ou Morbida, aconselhamos que procure um profissional!");
		}

		scan.close();

	}

}