package faculdadeatividade.questaopessoa;

public class Cliente extends Pessoa{

    private int codigo;

    public Cliente(String nome, String cpf, int codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.print("Codigo: "+ codigo+ ". ");
    }
}
