package progamasDasAulasOrientadasAObjetos.construtores;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
        quantity = 0;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}