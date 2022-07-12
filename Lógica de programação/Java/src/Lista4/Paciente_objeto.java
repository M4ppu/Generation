package Lista4;

public class Paciente_objeto {
	public static void main(String[] args) {
		Paciente pessoa = new Paciente();
		
		pessoa.setAlta(true);
		pessoa.setIdade(24);
		pessoa.setNome("Luiza");
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		pessoa.estado();		
	}
}