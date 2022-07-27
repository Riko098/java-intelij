package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			int x = sc.nextInt();
			if (x >= 0) {
				System.out.println("NAO NEGATIVO");
			} else {
				System.out.println("Negativo");
			}

		} catch (Exception e) {
			System.out.println("numero errado");
		}


		sc.close();

	}

}
