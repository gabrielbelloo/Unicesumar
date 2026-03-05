public class FreteTransportadora implements ITipoFrete{
    @Override
    public double calcularFrete(double pesoKg, double distanciaKm) {
        double frete = 20 + (1.0 * pesoKg) + (0.03 * distanciaKm);

        if (pesoKg > 50){
            return frete * 0.9;
        }
        return frete;
    }
}
