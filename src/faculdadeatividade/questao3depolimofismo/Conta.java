package faculdadeatividade.questao3depolimofismo;

public class Conta {

    protected String titular;
    protected double dinheiro;

    public Conta(String titular, double dinheiro) {
        this.titular = titular;
        this.dinheiro = dinheiro;
    }

    public void sacar(double dinheiro){
        if (this.dinheiro < dinheiro){
            System.out.println("Sem dinheiro para sacar");
        }
        else{
            this.dinheiro -= dinheiro;
            System.out.println("Saque realizado");
        }

    };

    public void depositar(double dinheiro){

        this.dinheiro += dinheiro;
        System.out.println("Deposito Realizado");

    };

}
