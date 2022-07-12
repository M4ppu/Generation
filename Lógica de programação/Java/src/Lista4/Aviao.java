package Lista4;

public class Aviao {
	private int passageiros;
	private boolean piloto;
	private String modelo;
	private double tamanho;
	private int capacidade;
	
	public void estado(){
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Tamanho do avião: " + this.tamanho + "m");
		System.out.println("Capacidade de " + this.capacidade + " pessoas");
		System.out.println(this.passageiros + " presentes no voo");
	}
	
	public void presente(){
		if(this.piloto == true) {
			System.out.println("O piloto está presente");
		}
		else {
			System.out.println("O piloto está ausente");
		}
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public void setPiloto(boolean piloto) {
		this.piloto = piloto;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}	
}