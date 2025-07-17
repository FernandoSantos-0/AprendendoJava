package progamasdasaulas.comportamentodememoria;

import java.util.Locale;

public class lacoforeach {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String[] vect = new String[]{"bob","maria","Alex"};

        for(String nomes : vect){
            System.out.println(nomes);

        }
    }
}
