package progamasDasAulasOrientadasAObjetos.exercicio01;

public class Product {

    String name;
    double price;
    int quantityInStock;
    double total;

    public int updateStock(int number){
        return quantityInStock += number;

    }
    public double updatetotal(){
        return total = price * quantityInStock;

    }


}
