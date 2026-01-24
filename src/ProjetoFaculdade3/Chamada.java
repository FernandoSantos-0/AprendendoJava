package ProjetoFaculdade3;

import java.util.List;

public class Chamada {

    private String ListaPessoas[];
    private int contador;

    public Chamada(String[] listaPessoas) {
        ListaPessoas = listaPessoas;
        contador = 0;
    }

    public void ChamarProximo(){

        if (ListaPessoas.length - contador > 0) {
            System.out.println("Chamando: " + ListaPessoas[contador]);
        }
        else {
            System.out.println("Todas As Pessoas Foram Chamadas!.");
        }
    }

    public void ProximoNumeroContador(){

        contador++;

    }

    public void QuantidadeRestante(){

        if (ListaPessoas.length - contador > 0) {
            System.out.println("Pessoas restantes: " + (ListaPessoas.length - contador));
        }
        else {
            System.out.println("Todas As Pessoas Foram Chamadas!.");
        }

    }

}
