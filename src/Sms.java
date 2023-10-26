public class Sms implements Notificacao {

    private String numTelefone;

    public Sms(String numTelefone){
        this.numTelefone = numTelefone;
    }
    @Override
    public void enviarNotificacao(String operacao, double Valor){
        String mensagem = "Operacao: " + operacao + ", Valor: "+Valor;
        enviarMensagemPorSms(numTelefone, mensagem);
    }
    public void enviarMensagemPorSms(String numTelefone, String mensagem){
        System.out.println("Enviando sms para "+numTelefone + ":" + mensagem);
    }

}
