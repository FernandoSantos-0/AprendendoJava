package faculdadeatividade.questaoautomovel;

public class Bicicleta extends Veiculo{

    @Override
    public float acelerar(float velocidade){
        return velocidade + 10;

    };

    @Override
    public void parar(){
        System.out.println("freaiando");

    };

}
