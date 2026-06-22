public class Main {
    public static void main(String[] args) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto(new DescontoFuncionario());

        System.out.println("Desconto: R$ " + calculadoraDesconto.calcularDesconto(100));

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto(new ImpostoPr());

        System.out.println("Imposto: R$ " + calculadoraImposto.calcularImposto(100));

        EnviadorNotificacao enviadorNotificacao = new EnviadorNotificacao(new NotificacaoWhatsapp());

        enviadorNotificacao.enviarNotificacao("Olha a mensagem!");

        ConfiguracaoSistema configuracaoSistema = ConfiguracaoSistema.getInstancia();

        System.out.println("Aplicação: " + configuracaoSistema.getNomeAplicacao() + " Ambiente: " + configuracaoSistema.getAmbienteExecucao());

        LoggerSistema.getInstancia().log("Pedido criado com sucesso");
        LoggerSistema.getInstancia().log("Pagamento aprovado");
        LoggerSistema.getInstancia().log("Erro ao calcular frete");

        System.out.println(LoggerSistema.getInstancia().getMensagens());

        FinalizadorPedido finalizadorPedido = new FinalizadorPedido(new FretePr(), new DescontoFuncionario());

        finalizadorPedido.finalizarPedido(100, 10);
    }
}