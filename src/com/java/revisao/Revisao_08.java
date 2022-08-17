package com.java.revisao;

import java.util.Scanner;

public class Revisao_08 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.println("Informa o valor da Compra (R$):");
	double valorCompra = scan.nextDouble();

	double valorFinal = valorCompra;
	;

	if (valorCompra < 100) {
		valorFinal += 15;
		System.out.println("O valor final a ser pago � de R$: " + valorFinal);
	} else {
		System.out.println("Voc� ganhou frete GRATIS! O valor final a ser pago � de R$: " + valorFinal);
	}

	scan.close();

}

}