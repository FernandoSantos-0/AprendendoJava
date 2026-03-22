package faculdadeatividade.questaoautomovel;

public class Automovel extends Veiculo{

    @Override
    public float acelerar(float velocidade){
        return 50 + velocidade;

    };

    @Override
    public void parar(){
       System.out.println("Parando");

    };

    public void trocarOleo(float litros){

        System.out.println("Foram colocados: " + litros + " litros de oleo.");

    };

}
