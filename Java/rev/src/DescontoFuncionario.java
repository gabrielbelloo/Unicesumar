public class DescontoFuncionario implements EstrategiaDesconto{
    @Override
    public double calcularDesconto(double valorCompra){
        return valorCompra * 0.2;
    }
}
