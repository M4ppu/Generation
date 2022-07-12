package Lista4;

public class Cliente {
	private String nome;
	private double altura;
	private int idade;
	

	public void estado(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Altura de: " + this.altura + "m");
		System.out.println("Idade: " + this.idade + " anos");
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
			return nome;
		}
	public void setAltura(double altura) {
		this.altura = altura;
	}	
	public double getAltura() {
		return altura;
	}
}