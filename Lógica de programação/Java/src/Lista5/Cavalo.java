package Lista5;

public class Cavalo extends Animal implements InterfaceAnimal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String toString() {
		return "Cavalo" + super.toString();
	}

	public void correr() {
		System.out.println("Correndo~~");
	}
}