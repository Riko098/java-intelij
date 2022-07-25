import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
//		N funcionários. Não deve haver repetição de id.
//		Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
//		Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
//		mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
//		conforme exemplos.
//		Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
//		ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
//		aumento por porcentagem dada.
//		(exemplo na próxima página)
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int qtdFuncionarios = sc.nextInt(); 
		List<Employee> employees = new  ArrayList<>();
	
		for (int i = 0; i < qtdFuncionarios; i++) {	   
			int  id = sc.nextInt();
			for (Employee employee : employees) {
	            while (employee.getId() == id) {
	            	System.out.println("Id existente digite novamente ");
	            	id = sc.nextInt();              
	            }
	        }
			
	        System.out.println("Digite o nome do funcionario ");
			sc.nextLine();
	        String nome = sc.nextLine();
	        System.out.println("Digite o salario do funcionario ");
			double salario = sc.nextDouble();
			
			employees.add(new Employee(id, nome, salario));
	
			
		}
		System.out.println(employees);
	
		
		
		sc.close();

	}

}
