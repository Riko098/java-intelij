package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		// peça 1 
		int cod1 = sc.nextInt();
		int numpecas1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		// peça 2
		
		int cod2 = sc.nextInt();
		int numpecas2 = sc.nextInt();
		double valor2= sc.nextDouble();
		
		double total = (numpecas1 * valor1)+(numpecas2 * valor2);
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		//System.out.println(cod1 +" " + numpecas1 +" " + valor1+" "+ cod2 +numpecas2+" " + valor2);		
		
		
		
		sc.close();

	}

}
