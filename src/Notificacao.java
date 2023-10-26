public interface Notificacao{

    @Ovarride
    public default void enviarNotificacao (String operacao, double valor){
        System.out.println("enviando email de notificacao");
        System.out.println("Operacao: "+operacao);
        System.out.println("Valor: "+valor);
    }
    
}
