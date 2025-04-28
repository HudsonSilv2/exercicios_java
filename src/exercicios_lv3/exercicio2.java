package exercicios_lv3;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int X = sc.nextInt();
		
		System.out.println("\nNúmeros Impares: ");
		for (int i=1; i<=X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
