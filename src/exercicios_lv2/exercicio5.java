package exercicios_lv2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o número do pedido?");
		int numero_pedido = entrada.nextInt();

		System.out.println("Qual a quantidade do pedido?");
		int qt_pedido = entrada.nextInt();

		switch (numero_pedido) {
		case 1: {
			double item = qt_pedido * 4.00;
			System.out.printf("Total: R$%.2f", item);
			break;
		}
		case 2: {
			double item = qt_pedido * 4.50;
			System.out.printf("Total: R$%.2f", item);
			break;
		}
		case 3: {
			double item = qt_pedido * 5.00;
			System.out.printf("Total: R$%.2f", item);
			break;
		}
		case 4: {
			double item = qt_pedido * 2.00;
			System.out.printf("Total: R$%.2f", item);
			break;
		}
		case 5: {
			double item = qt_pedido * 1.50;
			System.out.printf("Total: R$%.2f", item);
			break;
		}
		default:
			System.out.println("Digite um numero Válido!");
		}

		entrada.close();

	}

}
