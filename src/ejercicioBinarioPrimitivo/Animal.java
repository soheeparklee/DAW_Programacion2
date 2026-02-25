package ejercicioBinarioPrimitivo;

import java.io.Serializable;

public class Animal implements Serializable {
    private String name;
    private int numPatas;
    private double height;
    private boolean inMyhouse;

    public Animal(String name, int numPatas, double height, boolean inMyhouse) {
        this.name = name;
        this.numPatas = numPatas;
        this.height = height;
        this.inMyhouse = inMyhouse;
    }

    public double getHeight() {
        return height;
    }

    public boolean isInMyhouse() {
        return inMyhouse;
    }

    public String getName() {
        return name;
    }

    public int getNumPatas() {
        return numPatas;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", numPatas=" + numPatas +
                ", height=" + height +
                ", inMyhouse=" + inMyhouse +
                '}';
    }
}
