package miage.ds4h.dice.model;

import org.springframework.stereotype.Component;

@Component
public class Dice {
    private int value;
    private int nbFaces;

    public Dice(int nbFaces) {
        this.nbFaces = nbFaces;
        this.value = 0;
    }

    public Dice() {
        this(6);
    }

    public void roll() {
        this.value = (int) (Math.random() * this.nbFaces) + 1;
    }

    public int getValue() {
        return this.value;
    }

    public int getNbFaces() {
        return this.nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }
}