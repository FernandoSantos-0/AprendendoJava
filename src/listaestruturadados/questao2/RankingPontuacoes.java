package listaestruturadados.questao2;

import java.util.TreeSet;

public class RankingPontuacoes {

    public static void main(String[] args) {

        TreeSet<Integer> pontuacoes = new TreeSet<>();

        pontuacoes.add(500);
        pontuacoes.add(150);
        pontuacoes.add(999);
        pontuacoes.add(150);
        pontuacoes.add(800);
        pontuacoes.add(250);

        System.out.println("ordem crescente:");
        for (Integer p : pontuacoes) {
            System.out.println(p);
        }

        System.out.println("\nordem decrescente:");
        for (Integer p : pontuacoes.descendingSet()) {
            System.out.println(p);
        }
    }


}
