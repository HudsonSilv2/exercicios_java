package exercicios_lv2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um Número: "); 
		int number = entrada.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
		
		entrada.close();
	}
}
