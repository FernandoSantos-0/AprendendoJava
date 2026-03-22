package faculdadeatividade.questaopessoa;

public class Funcionario extends Pessoa{

    protected String matricula;
    protected double salario;

    public Funcionario(String nome,String cpf,String matricula,double salario){
        super(nome,cpf);
        this.matricula=matricula;
        this.salario=salario;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Matricula: "+matricula+". Salario: "+salario+". ");
    }
}
