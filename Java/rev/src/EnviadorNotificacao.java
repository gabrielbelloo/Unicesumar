public class EnviadorNotificacao {
    private EstrategiaNotificacao estrategiaNotificacao;

    public EnviadorNotificacao(EstrategiaNotificacao estrategiaNotificacao){
        this.estrategiaNotificacao = estrategiaNotificacao;
    }

    public void enviarNotificacao(String notificacao){
        estrategiaNotificacao.enviarNotificacao(notificacao);
    }
}
