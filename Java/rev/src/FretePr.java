public class FretePr implements EstrategiaFrete{
    @Override
    public double calcularFrete(double peso){
        return peso * 5;
    }
}
