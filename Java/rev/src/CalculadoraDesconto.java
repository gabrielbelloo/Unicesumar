public class CalculadoraDesconto {
    private EstrategiaDesconto estrategiaDesconto;

    public CalculadoraDesconto(EstrategiaDesconto estrategiaDesconto){
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularDesconto(double valorCompra){
        double percentualSolicitado = estrategiaDesconto.calcularDesconto(valorCompra);
        double percentualMaximo = ConfiguracaoDesconto.getInstancia().getPercentalMaximoDesconto();

        double percentualAplicado = Math.min(percentualMaximo, percentualSolicitado);

        return valorCompra * percentualAplicado;
    }
}
