package exerciciosfaculdade.lista4.questao1;

public class Conta {

    private String nome;
    private double valorConta;

    public Conta(){}

    public Conta(String nome, double valorConta) {
        this.nome = nome;
        this.valorConta = valorConta;
    }

    public String getNome() {
        return nome;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void sacar(double valor){

        if (valorConta >= valor){
            valorConta -= valor;
        }
        else{
            System.out.println("Nao e posivel sacar");
        }

    }

    public void deposito(double valor){
        valorConta += valor;
    }

    @Override
    public String toString(){
        return nome + " = " + valorConta;
    }

}
