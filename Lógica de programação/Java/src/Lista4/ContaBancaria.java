package Lista4;

public class ContaBancaria {
	private double saldo;
	
	public void estado() {
		if(saldo > 0) 
			System.out.println("Saldo positivo!");		
		else if(saldo == 0) 
			System.out.println("Saldo zerado");		
		else 
			System.out.println("Saldo negativo");		
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