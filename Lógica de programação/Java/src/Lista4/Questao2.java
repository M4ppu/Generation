package Lista4;

public class Questao2 {
	public static void main(String[] args) {
		Aviao vuum = new Aviao();
		vuum.setModelo("Boeing 747");
		vuum.setCapacidade(410);
		vuum.setPassageiros(382);
		vuum.setPiloto(true);
		vuum.setTamanho(70.6);
		
		vuum.estado();
		vuum.presente();
	}
}