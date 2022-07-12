package Lista4;

public class Paciente {
	String nome;
	int idade;
	boolean alta;
	
	public void estado() {
		if(this.alta == true)
			System.out.println("O paciênte teve alta");
		else
			System.out.println("O paciênte não teve alta");
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

	public boolean isAlta() {
		return alta;
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}
}