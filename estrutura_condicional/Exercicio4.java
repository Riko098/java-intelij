package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horaComeco = sc.nextInt();
		int horaFinal = sc.nextInt();
		int duracao;
		
		if (horaComeco >= horaFinal) {
			duracao = 24 - horaComeco + horaFinal;	
		} 
		
		else {
			duracao = horaFinal - horaComeco;
		}
		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
		
		
		sc.close();
	}

}
