package projetofacul2;

public class Aluno {

    private String name;
    private String cpf;
    private int numero;

    public Aluno(String name, String cpf, int numero) {
        this.name = name;
        this.cpf = cpf;
        this.numero = numero;
    }
    public Aluno() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
