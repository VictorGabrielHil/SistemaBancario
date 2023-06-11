package model;


public abstract class Conta implements ContaInterface {
   
    protected String tipoConta;
    protected double saldo;
    protected double depositoInicial;
    private Cliente dono;
  

    
    public Conta(String tipoConta, Cliente dono, double saldo, double depositoInicial) {
		super();
		this.setTipoConta(tipoConta) ;
		this.setDono(dono) ;
		this.setSaldo(saldo);
		this.setDepositoInicial(depositoInicial);
	}

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setDepositoInicial(double depositoInicial) {
        this.saldo = depositoInicial;
    }
    

	@Override
	public int getNumero() {
		// CRIAR MÉTODO QUE PUXA DO BANCO DE DADOS PARA APLICAÇÃO O NÚMERO DA CONTA
		return 0;
	}

	@Override
    public boolean deposita(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        else return false;
    }
    @Override
    public boolean saca(double valor){
        if (valor > 0){
            this.saldo -= valor;
            return true;
        }
        else return false;
    }
    @Override
    public void remunera(){}
    
    @Override
    public String getTipoConta(){ return this.tipoConta; }
    
    @Override
   	public double getDepositoInicial(){ return this.depositoInicial;}
    
    @Override
    public double getLimite(){ return -1; }
    
    @Override 
    public double getDepositoMinimo(){ return -1; }
    
    @Override
    public double getSaqueMinimo(){ return -1; }
    
 
    
    

}
