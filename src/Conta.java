public class Conta {
    private int numAgencia;
    private int numConta;
    private double saldo;
    private double chequeEspecial;
    private double rendimento;
    protected static Cliente cliente;

    public Conta(int numAgencia,int numConta,double saldo,double chequeEspecial,double rendimento,Cliente cliente) {
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.rendimento = rendimento;
        this.cliente = cliente;
    }
    public void depositar(double valor){
        System.out.println("Depositando: " +valor);
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if(valor <= saldo + chequeEspecial){
            saldo -= valor;
            System.out.println("Sacando: " +valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void transferir(Conta contaDestino, double valor){
        if(valor <- saldo + chequeEspecial) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferindo: " +valor + "para a consulta" +contaDestino.numConta);
        }else{
            System.out.println("Saldo insuficiente para transferencia");
        }
    }
    public int getnumAgencia(){
        return numAgencia;
    }
    public void setnumAgencia(int numAgencia){
        this.numAgencia = numAgencia;
    }
    public int getnumConta(){
        return numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public double setSaldo(double saldo){
       return  this.saldo = saldo;
    }
    
}

