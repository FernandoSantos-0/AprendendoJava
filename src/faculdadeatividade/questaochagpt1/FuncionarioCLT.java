package faculdadeatividade.questaochagpt1;

public class FuncionarioCLT extends Funcionario {

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){

        return salarioBase + 500;

    }

    @Override
    public void mostrarDados(){
        System.out.println("Nome: "+nome+", Salario: "+ calcularSalario());
    }

}
