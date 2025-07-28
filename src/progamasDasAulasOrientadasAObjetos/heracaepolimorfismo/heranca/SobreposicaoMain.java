package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.heranca;

public class SobreposicaoMain {
    public static void main(String[] args) {

        System.out.println("----------Sobreposição----------");

        Account acc6 = new Account(1001,"Fernando",1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        SavingsAccount acc7 = new SavingsAccount(1001,"joao",1000.0,500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        BusinessAccount acc8 = new BusinessAccount(1001,"joao",1000.0,500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

    }
}
