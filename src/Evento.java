import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String nome;
    private LocalDateTime dataHora;
    private DiaDaSemana diaDaSemana;

    public Evento(String nome, LocalDateTime dataHora,DiaDaSemana diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
        this.dataHora =  dataHora;
        this.nome = nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    private static DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void exibirEvento(Evento evento){
        System.out.println("Nome do Evento: " + evento.nome);
    }

    public static void exibirDataEvento(Evento evento) {
        System.out.println("Data e hora: " + evento.dataHora.format(formatador) + "\n");
    }
}
