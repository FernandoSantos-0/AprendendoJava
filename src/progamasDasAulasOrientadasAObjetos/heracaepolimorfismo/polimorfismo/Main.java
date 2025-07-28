package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo;

import progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo.entities.Account;
import progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.polimorfismo.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account(1001,"Alex",1000.0);
        Account acc2 = new SavingsAccount(1002,"pedro",1000.0,2.0);

        acc1.withdraw(50.0);
        acc2.withdraw(50.0);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        //Polimorfismo significa que uma variável de referência de uma superclasse (Account)
        // pode armazenar um objeto de qualquer de suas subclasses (SavingsAccount, por exemplo).

    }
}
