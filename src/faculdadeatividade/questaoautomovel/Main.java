package faculdadeatividade.questaoautomovel;

public class Main {

    public static void main(String[] args){

        Veiculo bicicleta = new Bicicleta();

        System.out.println(bicicleta.acelerar(10));

        bicicleta.parar();

        Automovel automovel = new Automovel();

        System.out.println(automovel.acelerar(50));

        automovel.trocarOleo(50);

        automovel.parar();



    }

}
