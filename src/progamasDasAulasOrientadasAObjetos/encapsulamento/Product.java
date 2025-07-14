package progamasDasAulasOrientadasAObjetos.encapsulamento;

public class Product {
    private String name;
    private double price;
    private int quantityInStock;

    public Product(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void addToStock(int quantity) {
        this.quantityInStock += quantity;
    }

    public void removeFromStock(int quantity) {
        if (quantity <= this.quantityInStock) {
            this.quantityInStock -= quantity;
        } else {
            System.out.println("Erro: não há produtos suficientes no estoque para remover.");
        }
    }

    public double totalValueInStock() {
        return price * quantityInStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }
}
