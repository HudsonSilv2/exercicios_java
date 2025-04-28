package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Id da peça1: ");
		int id_peca1 = entrada.nextInt();
		
		System.out.println("Quantidade de Peças1: ");
		int qt_peca1 = entrada.nextInt();
		
		System.out.println("Preço da peça1: ");
		double preco_peca1 = entrada.nextDouble();
		
		System.out.println("Id da peça2: ");
		int id_peca2 = entrada.nextInt();
		
		System.out.println("Quantidade de Peças2: ");
		int qt_peca2 = entrada.nextInt();
		
		System.out.println("Preço da peça2: ");
		double preco_peca2 = entrada.nextDouble();
		

		double preco_total = (qt_peca1 * preco_peca1) + (qt_peca2 * preco_peca2);
		
		System.out.printf("%nItens Comprados:%nItem ID 1: %d%nItem ID 2: %d%n", id_peca1, id_peca2);  
		
		System.out.printf("%nTOTAL A PAGAR = R$%.2f", preco_total);
		
		entrada.close();
		
	}
}
