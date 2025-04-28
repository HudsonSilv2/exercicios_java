package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		/* Calculadora de Àrea */
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio;
		
		System.out.print("Digite o Raio: ");
		raio = entrada.nextDouble();		
		double area = PI * (raio * raio);
		
		System.out.printf("Area = %.4f", area);
		
		
		entrada.close();
	}

}
