package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Id do Fucionario: ");
		int fucionario = entrada.nextInt();

		System.out.println("Quantas horas trabalhadas: ");
		int horas_trabalhadas = entrada.nextInt();

		System.out.println("Quanto ganha por hora: ");
		int preco_hora = entrada.nextInt();

		double salario = horas_trabalhadas * preco_hora;

		System.out.println("NUMBER = " + fucionario);
		System.out.printf("SALARY = %.2f", salario);

		entrada.close();
	}

}
