package Lista4;

public class ContaBancaria {
	private double saldo;
	
	public void estado() {
		if(saldo > 0) 
			System.out.println("Está positivo!");		
		else if(saldo == 0) 
			System.out.println("Está zerado");		
		else 
			System.out.println("Está negativo");		
	}
	
	public void saque(double valor) {
		this.saldo -= valor;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}