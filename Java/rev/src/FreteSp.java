public class FreteSp implements EstrategiaFrete{
    @Override
    public double calcularFrete(double peso){
        return peso * 6;
    }
}
