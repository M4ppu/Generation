package Lista4;

public class Patinete_objeto {
	public static void main(String[] args) {
		Patinete vruum = new Patinete();
		
		vruum.setQntRodas(4);
		vruum.setKmRodado(16);
		
		System.out.println("O patinete tem " + vruum.getQntRodas() + " rodas");
		System.out.println("E tem " + vruum.getKmRodado() + "km rodado");
	}	
}