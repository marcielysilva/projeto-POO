public class App {

    public static void main(String[] args) {
        
       Cliente cliente = new Cliente("Ana", "0674574-54", "12/04/ 2000", null);
       Conta conta = new Conta(123, 476, 1000,500,0.05, cliente);

        conta.depositar(200);
        System.out.println("Saldo apos deposito: "+conta.getSaldo());

        conta.sacar(100);
        System.out.println("Saldo apos saque: "+conta.getSaldo());


        System.out.println("Nome do cliente: "+cliente.getNome());
        System.out.println("CPF do cliente: "+cliente.getCPF());
        System.out.println("Data de nascimento do cliente: "+cliente.getDataDeNascimento());

        cliente.setNome("Ana");
        System.out.println("Novo nome do cliente: "+cliente.getNome());
       
    }
}
