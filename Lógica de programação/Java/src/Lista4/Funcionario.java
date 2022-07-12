package Lista4;

public class Funcionario {
	private double salario;
	private int horasTrabalhadas;
	private String nome;
	private boolean presente;
	
	public void trabalhando() {
		if(this.presente == true)
			System.out.println("O funcionário foi trabalhar");
		else
			System.out.println("O funcionário não foi trabalhar");
	}
	
	public void estado() {
		System.out.println("Nome: " + this.nome);
		System.out.printf("Salário de R$%.2f\n", this.salario);
		System.out.println("Trabalha " + this.horasTrabalhadas + " por dia");
	
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	public boolean isPresente() {
		return presente;
	}
}