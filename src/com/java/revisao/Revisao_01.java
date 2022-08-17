package com.java.revisao;

import java.util.Scanner;

public class Revisao_01 {
public static void main(String[] args) {
	System.out.println("Hola mundo!");

	Scanner ler = new Scanner(System.in);
	
	System.out.println("Informe um valor para A, B, C");
	int a = ler.nextInt();
	int b = ler.nextInt();
	int c = ler.nextInt();
	


	System.out.println("\n");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	ler.close();

}
}