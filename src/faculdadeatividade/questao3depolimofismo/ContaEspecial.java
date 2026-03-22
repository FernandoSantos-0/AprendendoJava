package faculdadeatividade.questao3depolimofismo;

public class ContaEspecial extends Conta{

    public ContaEspecial(String titular, double dinheiro) {
        super(titular, dinheiro);
    }

    @Override
    public void sacar(double dinheiro){
        this.dinheiro -= dinheiro;
        System.out.println("Saque realizado");
    }

}
