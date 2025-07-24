package progamasdasaulas.datahora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHoraCalculos {
    public static void main(String[] args) {

        LocalDate dataAgora = LocalDate.now();
        LocalDate dataAnoPasada = dataAgora.minusYears(1);
        LocalDate dataAnoQueVem = dataAgora.plusYears(1);

        System.out.println("Ano Pasado = " + dataAnoPasada);
        System.out.println("Ano que vem = " + dataAnoQueVem);

        Instant dataGlobalAgora = Instant.now();
        Instant dataGlobalOntem = dataGlobalAgora.minus(1, ChronoUnit.DAYS);
        Instant dataGlobalAnoQueVem = dataGlobalAgora.plus(365,ChronoUnit.DAYS);
        System.out.println("hoje = "+dataGlobalAgora);
        System.out.println("Ontem = "+dataGlobalOntem);
        System.out.println("Ano que vem = "+dataGlobalAnoQueVem);

        // Duração entre duas data-Horas (Obs: Duration calcula a data em segundos e nanosegundo não em dias,Para calcular
        // um LocalDate e preciso converter usando o comando .atTime(minutos,segundo) ou  atStartOfDay().)

        LocalDateTime dataLocal1 = LocalDateTime.parse("2025-10-10T06:00:00");
        LocalDateTime dataLocal2 = LocalDateTime.parse("2025-11-10T06:00:00");

        Duration duracaoEntreDuasDatas = Duration.between(dataLocal1,dataLocal2);
        System.out.println("Duracao entre data local 1 e 2 em dias = "+duracaoEntreDuasDatas.toDays());

        Duration duracaoEntreDuasDatasInstant = Duration.between(dataGlobalAgora,dataGlobalAnoQueVem);
        System.out.println("Duracao Entre duas datas instant = "+duracaoEntreDuasDatasInstant.toDays());

    }
}
