package com.sathamlet.herenciaMamiferos;

abstract public class Canino extends Mamifero {
    protected String color;
    protected float tamColmillos;

    public Canino(String habitad, float altura, float largo,
                  float peso, String nombreCientifico) {
        super(habitad, altura, largo, peso, nombreCientifico);
    }

    public Canino(String habitad, float altura, float largo,
                  float peso, String nombreCientifico, String color, float tamColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamColmillos = tamColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamColmillos() {
        return tamColmillos;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamColmillos(float tamColmillos) {
        this.tamColmillos = tamColmillos;
    }
}
