package progamasdasaulas.comportamentodememoria.exercicios;

public class ProductExercicioVetor {

    private String name;
    private double price;

    public ProductExercicioVetor(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "name = "
                + name +
                " | price = "
                + price;
    }
}
