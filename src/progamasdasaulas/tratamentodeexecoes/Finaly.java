package progamasdasaulas.tratamentodeexecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finaly {

    public static void main(String[] args) {

        File file = new File("C:\\temp\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }

        catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }

        // O finally sempre sera executado ao fim do tratamento de execoes.
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
