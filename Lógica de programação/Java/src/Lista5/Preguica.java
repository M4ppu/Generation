package Lista5;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String toString() {
		return "Preguica" + super.toString();
	}

	public void subir() {
		System.out.println("Subindo~~");
	}
}