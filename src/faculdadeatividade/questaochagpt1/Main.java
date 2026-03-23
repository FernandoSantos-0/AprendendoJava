package faculdadeatividade.questaochagpt1;

public class Main {
    public static void main(String[] args) {

        // Criando empresa
        Empresa empresa = new Empresa();

        // Criando funcionários
        Funcionario f1 = new FuncionarioCLT("João", 2000);
        Funcionario f2 = new FuncionarioPJ("Maria", 0, 5000);

        // Adicionando na empresa
        empresa.adicionarFuncionario(f1);
        empresa.adicionarFuncionario(f2);

        // Mostrando funcionários
        empresa.mostrarFuncionarios();
    }
}