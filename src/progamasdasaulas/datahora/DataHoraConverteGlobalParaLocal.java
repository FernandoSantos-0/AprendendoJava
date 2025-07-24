package progamasdasaulas.datahora;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHoraConverteGlobalParaLocal {
    public static void main(String[] args) {

        Instant dataAgoraGlobal = Instant.now();

        LocalDateTime dataGlobalParaLocal = LocalDateTime.ofInstant(dataAgoraGlobal, ZoneId.systemDefault());
        System.out.println(dataGlobalParaLocal);

        //pegar valor especifico da data

        LocalDateTime dataLocal = LocalDateTime.parse("2025-07-24T19:13:46");
        System.out.println("Dia = "+dataLocal.getDayOfMonth());
        System.out.println("Mes = "+dataLocal.getMonth());
        System.out.println("ano = "+dataLocal.getYear());
        System.out.println("hora = "+dataLocal.getHour());
        System.out.println("minutos = "+dataLocal.getMinute());
        System.out.println("segundo = "+dataLocal.getSecond());

    }
}
