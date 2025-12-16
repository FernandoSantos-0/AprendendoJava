package projetofacul2;

public class Instrutor {


    private String name;
    private String cref;
    private int numero;

    public Instrutor(String name, String cpf, int numero) {
        this.name = name;
        this.cref = cpf;
        this.numero = numero;
    }
    public Instrutor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cref;
    }

    public void setCpf(String cref) {
        this.cref = cref;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
