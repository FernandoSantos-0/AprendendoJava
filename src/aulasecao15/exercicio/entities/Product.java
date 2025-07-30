package aulasecao15.exercicio.entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;
    private Double totalValue;

    public Product (){
    }

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void totalPrice(){
        totalValue = price * quantity;
    }

    @Override
    public String toString(){
        return "Name:" + name + ", Price:" + price+ ", Quantity:" + quantity + ", TotalValue:"+totalValue;
    }

}
