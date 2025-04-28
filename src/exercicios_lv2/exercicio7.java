package exercicios_lv2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o Número: ");
		double number = entrada.nextDouble();

		if (number <= 25 && number >= 0) {
			System.out.println("intervalo [0, 25]");
		} else if (number >= 26 && number <= 50) {
			System.out.println("intervalo [25, 50]");
		} else if (number >= 51 && number <= 75) {
			System.out.println("intervalo [50, 75]");
		} else if (number >= 76 && number <= 100) {
			System.out.println("intervalo [75, 100]");
		} else if (number < 0) {
			System.out.println("intervalo invalido!");
		}

		entrada.close();
	}

}
