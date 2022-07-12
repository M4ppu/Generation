package Lista4;

public class Questao1 {

	public static void main(String[] args) {
		Cliente pessoa = new Cliente();		
		
		pessoa.setNome("Luiza");
		pessoa.setIdade(24);
		pessoa.setAltura(1.70);
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.printf("Altura: %.2fm", pessoa.getAltura());
		
		//pessoa.estado();		
	}
}