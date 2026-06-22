public class NotificacaoSms implements EstrategiaNotificacao{
    @Override
    public void enviarNotificacao(String notificacao){
        System.out.println("Notificação Sms: " + notificacao);
    }
}
