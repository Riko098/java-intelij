package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int diferenca = (num1 * num2 - num3 * num4);
		
		System.out.println(diferenca);
		
		
		
		
		sc.close();
	}

}
