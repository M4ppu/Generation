package Lista4;

public class Produto_eletronico {
	private boolean ligado;
	private double custo_mensal;
	private int potencia;
	
	public void estado() {
		if(this.ligado == true)
			System.out.println("O produto está ligado");
		else
			System.out.println("O produto está desligado");
	}
	
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getCusto_mensal() {
		return custo_mensal;
	}

	public void setCusto_mensal(double custo_mensal) {
		this.custo_mensal = custo_mensal;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}