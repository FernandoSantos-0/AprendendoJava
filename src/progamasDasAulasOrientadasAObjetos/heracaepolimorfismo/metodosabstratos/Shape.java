package progamasDasAulasOrientadasAObjetos.heracaepolimorfismo.metodosabstratos;

public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
    // Quando o metodo e abstrato a classe tbm tem que ser abstrato. É usado para usado para usar polimorfismo.

}