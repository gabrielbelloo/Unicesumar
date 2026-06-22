public class FreteRj implements EstrategiaFrete{
    @Override
    public double calcularFrete(double peso){
        return peso * 10;
    }
}
