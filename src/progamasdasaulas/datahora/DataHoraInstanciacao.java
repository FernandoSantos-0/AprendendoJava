package progamasdasaulas.datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHoraInstanciacao {
    public static void main(String[] args) {

        LocalDate dataAgora = LocalDate.now();
        System.out.println(dataAgora);

        LocalDateTime dataAgoraSegundos = LocalDateTime.now();
        System.out.println(dataAgoraSegundos);

        Instant dataGlobal = Instant.now();
        System.out.println(dataGlobal);

        LocalDate dataGeradaString = LocalDate.parse("2022-07-21");
        System.out.println(dataGeradaString);
        // Pode ser feito o mesmo com instant e LocalDateTime!. Só usar o comando parse.

        Instant dataLocalParaGlobalEspecificandoOTimeZone = Instant.parse("2025-07-24T19:13:46-03:00");
        System.out.println(dataLocalParaGlobalEspecificandoOTimeZone);

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataAgoraComFormato = LocalDate.parse("20/05/2005",formato1);
        System.out.println(dataAgoraComFormato);

        LocalDate dataInstanciacaoDiferente = LocalDate.of(2005,4,3);
        System.out.println(dataInstanciacaoDiferente);


    }
}
