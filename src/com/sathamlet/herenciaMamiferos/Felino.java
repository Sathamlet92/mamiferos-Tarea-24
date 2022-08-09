package com.sathamlet.herenciaMamiferos;

abstract class Felino extends Mamifero{

    protected float tamanoGarras;
    protected double velocidad;

    public Felino(String habitad, float altura, float largo, float peso,
                  String nombreCientifico, float tamanoGarras, double velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public double getVelocidad() {
        return velocidad;
    }

}
