package exercicios_lv3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int senha = 2002;

		while (X != senha) { // enquanto
			System.out.println("Senha invalida");
			X = sc.nextInt();
		}
		
		System.out.println("Senha correta!"); // é imprimido por ultimo quando a condição for aceita

		sc.close();
	}

}
