public class Email implements Notificacao {

    @Override
    public void enviarNotificacao(String operacao, double valor){
        System.out.println("Enviar email e notificacao. ");
        System.out.println("Operacao: "+operacao);
        System.out.println("Valor: "+valor);
  
    }
    
}
