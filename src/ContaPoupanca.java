public class ContaPoupanca extends Conta{
    private double tavaJurosAnual;
    private double taxaJurosAnual;
    
    public ContaPoupanca(int numAgencia, int numConta, double saldo,double chequeEspecial, double rendimento, double taxaJurosAnual, Cliente cliente){
        super(numAgencia, numConta, saldo, chequeEspecial, rendimento, cliente);
        this.taxaJurosAnual = taxaJurosAnual;
    }
    public void calcularTaxaManutencao(){
        double rendimentoMesal = getSaldo() * (taxaJurosAnual/12/100);
        depositar(rendimentoMesal);
            System.out.println("Rendimento mensal de: "+ rendimentoMesal + "reais adicionado a conta. ");
    }
}
