package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		Locale.setDefault(Locale.US);
		int numeroFuncionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHoraTrabalhada = sc.nextDouble();
		
		double salarioFuncionario = horasTrabalhadas * valorHoraTrabalhada;
		
		
		System.out.println("NUMBER = "+numeroFuncionario);
		System.out.println("SALARY = U$ "+salarioFuncionario);
		
		
		
		
		
		sc.close();
	}

}
