public class FinalizadorPedido {
    private EstrategiaFrete estrategiaFrete;
    private EstrategiaDesconto estrategiaDesconto;

    public FinalizadorPedido(EstrategiaFrete estrategiaFrete, EstrategiaDesconto estrategiaDesconto) {
        this.estrategiaFrete = estrategiaFrete;
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public void finalizarPedido(double valor, double peso){
        Pedido pedido = new Pedido(valor, peso);
        LoggerSistema.getInstancia().log("Pedido criado");

        double valorTotal = valor - estrategiaDesconto.calcularDesconto(valor) + estrategiaFrete.calcularFrete(peso);
        LoggerSistema.getInstancia().log("Valor Total calculado");

        System.out.println("Valor Base: " + valor);
        System.out.println("Valor Total: " + valorTotal);
        System.out.println("Percentual máximo de desconto: " + ConfiguracaoDesconto.getInstancia().getPercentalMaximoDesconto());
        System.out.println("Peso: " + peso);
        System.out.println("Valor Frete: " + estrategiaFrete.calcularFrete(peso));
        System.out.println("Logs: " + LoggerSistema.getInstancia().getMensagens());
    }
}
