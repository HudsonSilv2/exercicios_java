package exercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite os valores: \n");
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		int produto = (A * B) - (C * D);
		
		System.out.println("Resultado: " + produto);
		
		
		
		entrada.close();
	}

}
