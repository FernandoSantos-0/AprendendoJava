package listaestruturadados.questao3;

import java.util.HashMap;
import java.util.Map;

public class DicionarioAlunos {
    public static void main(String[] args) {

        HashMap<String, Double> alunos = new HashMap<>();

        alunos.put("Alice", 8.5);
        alunos.put("Bruno", 7.0);
        alunos.put("Carlos", 5.5);
        alunos.put("Diana", 9.0);
        alunos.put("Carlos", 6.5);

        System.out.println("Nota de Carlos: " + alunos.get("Carlos"));

        if (alunos.containsKey("Alice")) {
            System.out.println("Alice Existe.");
        }

        alunos.remove("Bruno");

        for (Map.Entry<String, Double> entry : alunos.entrySet()) {
            System.out.println("Aluno: " + entry.getKey() + " - Nota: " + entry.getValue());
        }
    }
}