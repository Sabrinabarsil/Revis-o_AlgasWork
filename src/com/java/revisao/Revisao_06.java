package com.java.revisao;

import java.util.Scanner;

public class Revisao_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Calculadora");
		System.out.println("informe o 1� valor: ");
		Double valorA = scan.nextDouble();

		System.out.println("Opera��es:");
		System.out.println("1 = +| 2 = -| 3 = *| 4 = /");
		int operacao = scan.nextInt();

		System.out.println("Informe o 2� valor: ");
		Double valorB = scan.nextDouble();

		Double resultado = null;

		if (operacao == 1) {
			resultado = valorA + valorB;
		}
		if (operacao == 2) {
			resultado = valorA-valorB;
		}
		if (operacao == 3) {
			resultado = valorA*valorB;
		}
		if (operacao == 4) {
			resultado = valorA/valorB;
		}
		
		System.out.println("Resultado = " + resultado);
		scan.close();

	}

}