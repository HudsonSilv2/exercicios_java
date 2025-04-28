package exercicios_lv2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um Número: ");
		int A = entrada.nextInt();
		
		System.out.println("Digite outro Número: ");
		int B = entrada.nextInt();

		int C = A + B;
		
		if (C % 2==0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
			
		}

		entrada.close();
	}

}
