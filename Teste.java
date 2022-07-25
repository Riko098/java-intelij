import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
//		N funcion�rios. N�o deve haver repeti��o de id.
//		Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
//		Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
//		mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
//		conforme exemplos.
//		Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
//		ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
//		aumento por porcentagem dada.
//		(exemplo na pr�xima p�gina)
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
