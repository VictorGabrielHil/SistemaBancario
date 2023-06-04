package model;

public class ContaInvestimento extends Conta {

	double depositoMinimo;
	double montanteMinimo;
	double saqueMinimo;

	public ContaInvestimento(int numConta, String tipo, Cliente dono, double saldo, double depositoMinimo,
			double montanteMinimo, double saqueMinimo) {
		super(numConta, tipo, dono, saldo);
		this.setDepositoMinimo(depositoMinimo);
		this.setMontanteMinimo(montanteMinimo);
		this.setSaqueMinimo(saqueMinimo);

	}

	public double getSaqueMinimo() {
		return saqueMinimo;
	}

	public void setSaqueMinimo(double saqueMinimo) {
		this.saqueMinimo = saqueMinimo;
	}

	public double getDepositoMinimo() {
		return depositoMinimo;
	}

	public void setDepositoMinimo(double depositoMinimo) {
		this.depositoMinimo = depositoMinimo;
	}

	public double getMontanteMinimo() {
		return montanteMinimo;
	}

	public void setMontanteMinimo(double montanteMinimo) {
		this.montanteMinimo = montanteMinimo;
	}

	@Override
	public boolean deposita(double valor) {
		if (valor >= this.depositoMinimo) {
			return super.deposita(valor);
		} else {
			return false;

		}

	}
	
	  @Override
	    public boolean saca(double valor) {
	        if (valor >= this.saqueMinimo)
	            return super.saca(valor);
	        else return false;
	    }

	    @Override
	    public void remunera() {
	        this.saldo += this.saldo* 0.02;
	    }
}
