package estrutura_condicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double valorTotal = 0;

		if (cod == 1) {
			valorTotal = quantidade * 4;
		} else if (cod == 2) {
			valorTotal = quantidade * 4.50;
		} else if (cod == 3) {
			valorTotal = quantidade * 5.00;

		} else if (cod == 4) {
			valorTotal = quantidade * 2.00;
		} else if (cod == 5) {
			valorTotal = quantidade * 1.50;
		}
		System.out.printf("Total: R$ %.2f " , valorTotal);

		sc.close();

	}

}
