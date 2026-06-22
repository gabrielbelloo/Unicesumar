public class ImpostoRj implements EstrategiaImposto{
    @Override
    public double calcularImposto(double valor){
        return valor * 0.2;
    }
}
