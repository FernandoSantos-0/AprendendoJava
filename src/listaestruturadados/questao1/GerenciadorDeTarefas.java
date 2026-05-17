package listaestruturadados.questao1;

import java.util.ArrayList;

public class GerenciadorDeTarefas {

    public static void main(String[] args) {

        ArrayList<String> tarefas = new ArrayList<>();

        tarefas.add("Estudar Java");
        tarefas.add("Fazer exercícios");
        tarefas.add("Ler um livro");
        tarefas.add("Estudar Java");

        System.out.println("lista de tarefas:");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }

        tarefas.remove(1);

        tarefas.remove("Ler um livro");

        if (tarefas.contains("Estudar Java")) {
            System.out.println("A tarefa 'Estudar Java' ainda está na lista.");
        }

        System.out.println("quantidade de tarefas restantes: " + tarefas.size());
    }
}
