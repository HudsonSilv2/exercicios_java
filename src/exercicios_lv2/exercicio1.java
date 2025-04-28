package exercicios_lv2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		if(num < 0 ) {
			System.out.println("Negativo!");
		} else {
			System.out.println("Positivo!");
		}
		
		
		entrada.close();
	}
}
