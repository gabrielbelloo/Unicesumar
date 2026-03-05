public class FreteMotoboy implements ITipoFrete{
    @Override
    public double calcularFrete(double pesoKg, double distanciaKm) {

        if (pesoKg > 10 || distanciaKm > 15){
            System.out.println("\nFrete escolhido indisponível para pacotes acima de 10kg");
            System.out.println("Frete escolhido indisponível para pacotes à mais de 15km");
            return -1.00;
        }

        return 8.0 + (2.0 * distanciaKm);
    }
}
