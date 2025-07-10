package progamasDasAulasOrientadasAObjetos.exercicio03;

public class Conversor {

    public static double DOLLAR = 3.10;

    public static double converterwithtax(double valueInReais){
        return ((valueInReais * DOLLAR) * 0.06) + (valueInReais * DOLLAR);
    }

}
