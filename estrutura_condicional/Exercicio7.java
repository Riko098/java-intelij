package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de x");
		double x = sc.nextDouble();
		System.out.println("Digite o valor de y");
		double y = sc.nextDouble();
		if (y == 0 && x == 00) {
			System.out.println("Origem");
		} else {
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			}
			if (x < 0 && y > 0) {
				System.out.println("Q2");
			}
			if (x < 0 && y < 0) {
				System.out.println("Q3");
			}
			if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
		}

		sc.close();
	}

}
