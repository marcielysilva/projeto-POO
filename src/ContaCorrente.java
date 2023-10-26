public class ContaCorrente extends Conta {
    private static final double taxaManutencao = 10.0; 

    public ContaCorrente(int numAgencia, int numConta, double saldo, double chequeEspecial, double rendimento, Cliente cliente){
        super(numAgencia, numConta, saldo, chequeEspecial, rendimento, cliente);
    }
    public void emitirCheque(double Valor){
        if (Valor <= getSaldo()+ getChequeEspecial()){
            sacar(Valor);
            System.out.println("Cheque de "+ Valor + "reais emitido com sucesso.");
        }else {
            System.out.println("Saldo insuficiente para emitir o cheque especial");
        }
    }

    private double getChequeEspecial() {
        return 0;
    }
    public void calcularTaxaManutencao(){
        if (getSaldo() >= taxaManutencao){
            sacar(taxaManutencao);
            System.out.println("Taxa demanutencao de " + taxaManutencao + "reais debitado da conta.");
        }else{
            System.out.println("Saldo insuficiente para cobrir a taxa de manutencao.");
        }
    }
    
}
