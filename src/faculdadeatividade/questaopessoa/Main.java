package faculdadeatividade.questaopessoa;

public class Main {

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("Pedro","1040124817");

        pessoa1.mostraDados();

        Pessoa pessoa2 = new Cliente("Joao","5810825",901);

        pessoa2.mostraDados();

        Pessoa pessoa3 = new Funcionario("Carlos","4915105","hkseojog",9000);

        pessoa3.mostraDados();

        Pessoa pessoa4 = new Gerente("Antonio","9410401","awjrpawr",12000,100);

        pessoa4.mostraDados();

    }

}
