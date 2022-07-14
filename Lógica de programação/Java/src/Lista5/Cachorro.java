package Lista5;

public class Cachorro extends Animal implements InterfaceAnimal{
	private String raca;
	
	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}
	
	@Override
	public String toString() {		
		return "Cachorro" + super.toString() +  "\nRaça: " + raca;
	}


	public void correr() {
		System.out.println("Correndo~~");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}	
}