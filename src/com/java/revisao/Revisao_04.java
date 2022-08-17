package com.java.revisao;

import java.util.Scanner;

public class Revisao_04 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
		
		System.out.println("Valor do Produto (R$) e a quantidade desejada: ");
		double produto = scan.nextDouble();
		int quantidade = scan.nextInt();
		
		double subtotal = produto*quantidade;
		double percentualDesconto = 0.0; // desclarar a variavel de desconto fora do la�o de decis�o
		
		if (quantidade >10) {
			 percentualDesconto = 10.0; // incluir valor na var de desconto para ser aplicada na condi��o criada
			
			}
		double desconto = subtotal * percentualDesconto /100; // valor do desconto
		double valorTotalComDesconto = subtotal - desconto; // valor do desconto subtraido do subtotal (quantidade*valor
		
		System.out.println("Valor Total R$" + valorTotalComDesconto);
		
		scan.close();
		
		

	}

}