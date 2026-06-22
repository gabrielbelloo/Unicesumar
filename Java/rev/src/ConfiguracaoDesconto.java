public class ConfiguracaoDesconto {
    private static final ConfiguracaoDesconto INSTANCIA =
        new ConfiguracaoDesconto();

    private double percentalMaximoDesconto;

    public ConfiguracaoDesconto() {
        this.percentalMaximoDesconto = 0.15;
    }

    public static ConfiguracaoDesconto getInstancia(){
        return INSTANCIA;
    }

    public double getPercentalMaximoDesconto() {
        return percentalMaximoDesconto;
    }

    public void setPercentalMaximoDesconto(double percentalMaximoDesconto) {
        this.percentalMaximoDesconto = percentalMaximoDesconto;
    }
}
