package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			int x = sc.nextInt();
			if (x % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			}	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Escreva um numero seu FILHO DA PUTA");
		}
		
		
		
		sc.close();

	}

}
