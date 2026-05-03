package atividadeestruturadados.questao6;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    String nome;
    int id;
    List<Livro> livrosEmprestados = new ArrayList<>();

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
}