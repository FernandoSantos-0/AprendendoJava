package projetofacul2;

public class Mensalidade {

    private double valor;
    private String dataDeVencimento;
    private String statusDoPagamento;

    public Mensalidade() {
    }

    public Mensalidade(double valor, String dataDeVencimento, String statusDoPagamento) {
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
        this.statusDoPagamento = statusDoPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getStatusDoPagamento() {
        return statusDoPagamento;
    }

    public void setStatusDoPagamento(String statusDoPagamento) {
        this.statusDoPagamento = statusDoPagamento;
    }
}
