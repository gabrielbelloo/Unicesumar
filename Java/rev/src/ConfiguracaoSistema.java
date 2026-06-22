public class ConfiguracaoSistema {
    private static final ConfiguracaoSistema INSTANCIA =
            new ConfiguracaoSistema();

    private String urlBancoDeDados;
    private String nomeAplicacao;
    private String ambienteExecucao;
    private String chaveApi;

    public ConfiguracaoSistema(){
        urlBancoDeDados = "url do banco aqui";
        nomeAplicacao = "aplicacao de estoque";
        ambienteExecucao = "desenvolvimento";
        chaveApi = "chaveApi aqui";
    }

    public static ConfiguracaoSistema getInstancia() {
        return INSTANCIA;
    }

    public String getUrlBancoDeDados() {
        return urlBancoDeDados;
    }

    public void setUrlBancoDeDados(String urlBancoDeDados) {
        this.urlBancoDeDados = urlBancoDeDados;
    }

    public String getNomeAplicacao() {
        return nomeAplicacao;
    }

    public void setNomeAplicacao(String nomeAplicacao) {
        this.nomeAplicacao = nomeAplicacao;
    }

    public String getAmbienteExecucao() {
        return ambienteExecucao;
    }

    public void setAmbienteExecucao(String ambienteExecucao) {
        this.ambienteExecucao = ambienteExecucao;
    }

    public String getChaveApi() {
        return chaveApi;
    }

    public void setChaveApi(String chaveApi) {
        this.chaveApi = chaveApi;
    }
}
