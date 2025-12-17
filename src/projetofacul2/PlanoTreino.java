package projetofacul2;

public class PlanoTreino {

    private String descricao;
    private int duracaoSemanas;

    public PlanoTreino(String descricao, int duracaoSemanas) {
        this.descricao = descricao;
        this.duracaoSemanas = duracaoSemanas;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

}
