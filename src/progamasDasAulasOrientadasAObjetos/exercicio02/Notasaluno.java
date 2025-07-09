package progamasDasAulasOrientadasAObjetos.exercicio02;

public class Notasaluno {

    double grade1;
    double grade2;
    double grade3;

    public void finalgrade(){

        double gradefinal = (grade1+grade2+grade3)/3;

        if (gradefinal >= 6.0){
            System.out.println("Final grade = "+gradefinal);
            System.out.println("PASS");
        }
        else{
            double finalGradeNecessary = 6.0 - gradefinal;
            System.out.println("Final grade = "+gradefinal);
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS",finalGradeNecessary);
        }

    }


}
