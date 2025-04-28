package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/* Calculadora de Numeros inteiros. */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		System.out.println("\nSoma = " + soma);
		
		
		
		
		sc.close();
	}

}
