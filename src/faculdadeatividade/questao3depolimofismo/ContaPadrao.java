package faculdadeatividade.questao3depolimofismo;

public class ContaPadrao extends Conta{

    public ContaPadrao(String titular, double dinheiro) {
        super(titular, dinheiro);
    }

    @Override
    public void depositar(double dinheiro) {
        super.depositar(dinheiro);
        this.dinheiro += (5%dinheiro);
    }
}
