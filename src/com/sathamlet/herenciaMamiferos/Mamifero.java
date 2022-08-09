package com.sathamlet.herenciaMamiferos;

abstract class Mamifero {
    protected String habitad;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

    public Mamifero(){}

    public Mamifero(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public Mamifero(String habitad, float altura,
                    float largo, float peso, String nombreCientifico) {
        this(nombreCientifico);
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
