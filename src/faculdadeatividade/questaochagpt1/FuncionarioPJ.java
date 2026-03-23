package faculdadeatividade.questaochagpt1;

public class FuncionarioPJ extends Funcionario {

    private double valorProjeto;

    public FuncionarioPJ(String nome, double salarioBase, double valorProjeto) {
        super(nome, salarioBase);
        this.valorProjeto = valorProjeto;
    }

    @Override
    public double calcularSalario(){

        return valorProjeto;

    }

    @Override
    public void mostrarDados(){
        System.out.println("Nome: "+nome+", Salario: "+ calcularSalario());
    }
}
