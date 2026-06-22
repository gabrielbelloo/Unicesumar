import java.util.ArrayList;
import java.util.List;

public class LoggerSistema {
    private static final LoggerSistema INSTANCIA =
            new LoggerSistema();

    private List<String> mensagens;

    public LoggerSistema() {
        this.mensagens = new ArrayList<>();
    }

    public void log(String mensagem){
        mensagens.add(mensagem);
    }

    public static LoggerSistema getInstancia() {
        return INSTANCIA;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<String> mensagens) {
        this.mensagens = mensagens;
    }
}
