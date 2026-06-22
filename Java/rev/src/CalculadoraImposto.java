public class CalculadoraImposto {
    private EstrategiaImposto estrategiaImposto;

    public CalculadoraImposto(EstrategiaImposto estrategiaImposto){
        this.estrategiaImposto = estrategiaImposto;
    }

    public double calcularImposto(double valor){
        return estrategiaImposto.calcularImposto(valor);
    }
}
