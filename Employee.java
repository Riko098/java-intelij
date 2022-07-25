
public class Employee {
	int id;
	String nome;
	double salario;

	public Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public void increaseSalary(int id ,double increase) {
		id = this.id;
		salario += salario * increase / 100;

	}

}
