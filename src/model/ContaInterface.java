package model;

public interface ContaInterface {

    public boolean deposita(double valor);

    public boolean saca(double valor);

    public Cliente getDono();

    public int getNumero();

    public double getSaldo();

    public void remunera();
    
    public String getTipoConta();
    
    public double getDepositoInicial();
    
    public double getLimite();
    
    public double getDepositoMinimo();
    
    public double getSaqueMinimo();

}
