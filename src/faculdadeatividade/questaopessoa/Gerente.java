package faculdadeatividade.questaopessoa;

public class Gerente extends Funcionario{

    private int area;

    public Gerente(String nome, String cpf, String matricula, double salario, int area) {
        super(nome, cpf, matricula, salario);
        this.area = area;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Area: "+area+". ");
    }
}
