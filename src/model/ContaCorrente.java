package model;

public class ContaCorrente extends Conta {
	double depInicial;
	double limite;

	public ContaCorrente(int numConta, String tipo, Cliente dono, double saldo, double depInicial, double limite) {
		super(tipo, dono, saldo, depInicial);
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
