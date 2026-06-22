public class NotificacaoPushNotification implements EstrategiaNotificacao{
    @Override
    public void enviarNotificacao(String notificacao){
        System.out.println("Notificação Push Notification: " + notificacao);
    }
}
