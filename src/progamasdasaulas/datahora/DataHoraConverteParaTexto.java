package progamasdasaulas.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraConverteParaTexto {
    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/text/SimpleDateFormat.html

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataGeradaString = LocalDate.parse("2022-07-21");
        System.out.println(dataGeradaString.format(formato1));

        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora.format(formato1));
        System.out.println(formato1.format(dataAgora));

        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        Instant dataGlobalAgora = Instant.now();
        System.out.println(formato2.format(dataGlobalAgora));
        // Considera o fuso horario da maquina usada para executar o arquivo java

    }
}
