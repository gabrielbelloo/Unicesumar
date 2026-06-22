public class NotificacaoWhatsapp implements EstrategiaNotificacao{
    @Override
    public void enviarNotificacao(String notificacao){
        System.out.println("Notificação Whatsapp: " + notificacao);
    }
}
