package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		double numero = sc.nextDouble();

		if (numero < 0 || numero > 100) {
			
			System.out.println("Fora de intervalo");

		} else {
			if (numero > 0 && numero <= 25) {
				System.out.println("Intervalo [0,25]");
			}
			if (numero > 25 && numero <= 50) {
				System.out.println("Intervalo [25,50]");
			}
			if (numero > 50 && numero <= 75) {
				System.out.println("Intervalo [50,75]");
			}
			if (numero > 75 && numero <= 100) {
				System.out.println("Intervalo [75,100]");
			}
		}

		sc.close();

	}

}
