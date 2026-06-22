public class ImpostoSp implements EstrategiaImposto{
    @Override
    public double calcularImposto(double valor){
        return valor * 0.18;
    }
}
