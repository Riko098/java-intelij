package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raio = sc.nextDouble();
		
		double area = 3.14159*Math.pow(raio, 2);
		
		System.out.println(area);
		
		
		
		sc.close();
	}

}
