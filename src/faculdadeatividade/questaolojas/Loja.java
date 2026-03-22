package faculdadeatividade.questaolojas;

public abstract class Loja {

    protected String cnpj;
    protected String razaoSocial;
    protected boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }


}
