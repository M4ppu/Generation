package Lista5;

public class Animal {
	private String nome;
	private int idade;
	
	public String emitirSom() {
		return "Emitindo som~~";
	}
	public void emitir() {
		System.out.println("Emitindo som~~");
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "\nAnimal nome: " + nome + "\nIdade: " + idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}