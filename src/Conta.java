public class Conta {
    private String numAgencia;
    private int numConta;
    private double saldo;

    public Conta(String numAgencia, int numConta) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
    }
    public String getAgencia() {
        return numAgencia;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}

