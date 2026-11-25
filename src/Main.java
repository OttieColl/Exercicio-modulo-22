import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Evento evento1 = new Evento("Evento1", LocalDateTime.of(2026, 11, 24, 22, 15), DiaDaSemana.TERCA);

        System.out.println("Evento atual:");
        Evento.exibirEvento(evento1);
        Evento.exibirDataEvento(evento1);

        evento1.setDataHora(evento1.getDataHora().plusDays(5));
        System.out.println("Adicionando 5 dias à data do evento...");
        System.out.print("Nova ");
        Evento.exibirDataEvento(evento1);

        ZoneId saoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId gmt = ZoneId.of("GMT");

        ZonedDateTime horaSp = evento1.getDataHora().atZone(saoPaulo);
        ZonedDateTime horaGMT = horaSp.withZoneSameInstant(gmt);

        System.out.println("Data e hora do evento(BRT): " + horaSp.format(formatador));
        System.out.println("Data e hora do evento(GMT): " + horaGMT.format(formatador));
    }
}
