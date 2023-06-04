package model;

public class ContaCorrente extends Conta {
	double depInicial;
	double limite;

	public ContaCorrente(int numConta, String tipo, Cliente dono, double saldo, double depInicial, double limite) {
		super(numConta, tipo, dono, saldo);
		this.depInicial = depInicial;
		this.setSaldo(depInicial);
		this.limite = limite;
		this.tipo = "CC";

	}

	public double getDepInicial() {
		return depInicial;
	}

	public void setDepInicial(double depInicial) {
		this.depInicial = depInicial;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}


	@Override
	public boolean saca(double valor) {
		if (valor > 0) {
			this.saldo -= valor;
			return true;
		} else
			return false;
	}

	@Override
    public void remunera(){
        this.saldo += this.saldo * 0.01;
    }
    

}
