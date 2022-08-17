package com.java.revisao;

import java.util.Scanner;

public class Revisao_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a Meta (R$) estipulada para o faturamento da empresa de 2021:");
		double meta2021 = scan.nextDouble();

		System.out.println("Informe o valor total que a empresa faturou em 2021:");
		double faturamento2021 = scan.nextDouble();

		System.out.println("Informe a media do salario dos funcionarios da empresa em 2021:");
		double mediaSalario2021 = scan.nextDouble();

		double oitentaPorCentoMeta = (meta2021 * 80) / 100;

		boolean recebemBonus = faturamento2021 >= meta2021;
		boolean bonusParcial = faturamento2021 >= oitentaPorCentoMeta;

		if (recebemBonus) {
			System.out.println("Bonus 100% Liberado, o valor do bonus será de R$ " + mediaSalario2021);
		}
		else if (bonusParcial) {
			double bonusOitentaPorCento = (mediaSalario2021 * 80) / 100;
			System.out.println("Bonus 80% liberado, o valor do bonus será de R$ " + bonusOitentaPorCento);
		} 
		else {
			System.out.println("A meta não foi alcançada, bonus não liberado");
		}
		scan.close();
	}


}

//crtl + shift + C comenta a sessão selecionada
//Alt + ceta para cima ou para baixo move o código