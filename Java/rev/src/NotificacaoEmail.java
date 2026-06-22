public class NotificacaoEmail implements EstrategiaNotificacao{
    @Override
    public void enviarNotificacao(String notificacao){
        System.out.println("Notificação Email: " + notificacao);
    }
}
