package com.java.revisao;

import java.util.Scanner;

public class Revisao_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double total=0;
		
		System.out.println("Controle Financeiro Familiar");
		
		System.out.println("Informe o valor da Conta de �gua");
		total += scan.nextDouble();
		System.out.println("Informe o valor da Conta de Luz");
		total += scan.nextDouble();
		System.out.println("Informe o valor da Conta de Telefone");
		total += scan.nextDouble();
		System.out.println("Informe o valor da mensalidade Escolar");
		total += scan.nextDouble();
		System.out.println("Informe o valor da Fatura do Cart�o");
		total += scan.nextDouble();
		System.out.println("Informe o valor das despesas no Supermercado");
		total += scan.nextDouble();
		
		System.out.println("O Valor das despesas mensal foi de R$: " + total);
		
		scan.close();

		}
	}