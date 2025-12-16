package projetofacul2;

public class PlanoTreino {

    private String descricao;
    private int duracaoSemanas;

    public PlanoTreino() {
    }

    public PlanoTreino(String descricao, int duracaoSemanas) {
        this.descricao = descricao;
        this.duracaoSemanas = duracaoSemanas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }
}
