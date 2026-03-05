public class FreteCorreios implements ITipoFrete {
    @Override
    public double calcularFrete(double pesoKg, double distanciaKm) {

        if (pesoKg > 30) {
            System.out.println("\nFrete escolhido indisponível para pacotes acima de 30kg");
            return -1.00;
        }
        return 12.00 + (1.50 * pesoKg) + (0.05 * distanciaKm);
    }
}
