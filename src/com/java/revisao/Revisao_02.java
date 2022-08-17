package com.java.revisao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Revisao_02 {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("Informe valor do Produto R$ ");
		Double valorDoProduto = scan.nextDouble();
		
		System.out.print("Informe valor pago pelo cliente R$ ");
		Double clientePagou = scan.nextDouble();
		
		Double troco = clientePagou - valorDoProduto;

		//DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        // decimalFormat.setRoundingMode(RoundingMode.DOWN);		
		//System.out.println("O vendedor deve retornar ao cliente o troco de R$" + decimalFormat.format(troco));
		
              
        System.out.println( "O vendedor deve retornar um troco de R$ "  + new DecimalFormat("#,##0.00").format(troco) );//
		
		
		scan.close();
	}

}