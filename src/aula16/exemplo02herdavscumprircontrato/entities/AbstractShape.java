package aula16.exemplo02herdavscumprircontrato.entities;

import aula16.exemplo02herdavscumprircontrato.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}