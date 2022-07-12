package Lista4;

public class Funcionario_objeto {
	public static void main(String[] args) {
		Funcionario pessoa = new Funcionario();
		
		pessoa.setHorasTrabalhadas(8);
		pessoa.setNome("Luiza");
		pessoa.setPresente(true);
		pessoa.setSalario(1212);
		
		pessoa.estado();
		pessoa.trabalhando();
	}
}