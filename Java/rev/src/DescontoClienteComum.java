public class DescontoClienteComum implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(double valorCompra){
        return valorCompra * 0.05;
    }
}
