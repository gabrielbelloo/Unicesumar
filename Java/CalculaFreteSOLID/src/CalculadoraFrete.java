public class CalculadoraFrete {
    public static double calculaFrete(double pesoKg, double distanciaKm, ITipoFrete tipoFrete){
        return tipoFrete.calcularFrete(pesoKg, distanciaKm);
    }
}
