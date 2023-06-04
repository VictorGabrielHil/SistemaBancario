package model;

public abstract class Conta implements ContaInterface {
    private int numConta;
    protected String tipo;
    private Cliente dono;
    protected double saldo;

    
    public Conta(int numConta, String tipo, Cliente dono, double saldo) {
		super();
		this.setNumConta(numConta);
		this.setTipo(tipo) ;
		this.setDono(dono) ;
		this.setSaldo(saldo);
	}

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    
    
    @Override
    public int getNumero()
    	{ 
    	return this.numConta; 
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
    
    public void remunera(){
        
    }
    
    
    
    

}
