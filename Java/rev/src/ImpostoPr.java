public class ImpostoPr implements EstrategiaImposto{
    @Override
    public double calcularImposto(double valor){
        return valor * 0.12;
    }
}
