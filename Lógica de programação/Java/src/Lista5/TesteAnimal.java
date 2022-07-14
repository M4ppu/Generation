package Lista5;

public class TesteAnimal {
	public static void main(String[] args) {
		Cachorro sujo = new Cachorro("Cleber", 6, "Vira-lata Caramelo");
		Preguica molhada = new Preguica("Thyago", 25);
		Cavalo manco = new Cavalo("Joelma", 48);
		
		System.out.println(sujo.toString() + "\n");
		System.out.println(molhada.toString() + "\n");
		System.out.println(manco.toString());
	}
}