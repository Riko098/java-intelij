package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x % y == 0 || y % x == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Escreva um numero" );
		}
		
		sc.close();

	}

}
