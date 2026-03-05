public class Main {
    public static void main(String[] args) {


        ITipoFrete frete = new FreteDrone();

        System.out.println(CalculadoraFrete.calculaFrete(
                100, 10, frete
        ));

    }
}
