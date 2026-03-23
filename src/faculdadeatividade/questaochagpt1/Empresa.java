package faculdadeatividade.questaochagpt1;

import java.util.List;

public class Empresa {

    private Funcionario[] funcionarios = new Funcionario[10];

    public void adicionarFuncionario(Funcionario f){
        for (int i = 0; i < funcionarios.length;i++){
            if (funcionarios[i] == null){
                funcionarios[i] = f;
                break;
            }
        }
    }


    public void mostrarFuncionarios(){

        for (int i = 0; i < funcionarios.length;i++){

            funcionarios[i].mostrarDados();

        }

    }
}
