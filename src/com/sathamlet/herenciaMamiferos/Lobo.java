package com.sathamlet.herenciaMamiferos;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamColmillos);
    }

    public Lobo(String habitad, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamColmillos, int numCamada, String especieLobo) {
        this(habitad, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(int numCamada) {
        this.numCamada = numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(String especieLobo) {
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "Los lobos siempre cazan en manada";
    }

    @Override
    public String dormir() {
        return "Los lobos duermen cerca de lugares donde pueden cazar";
    }

    @Override
    public String correr() {
        return "Los lobos pueden correr hasta a una velocidad de 50km/h";
    }

    @Override
    public String comunicarse() {
        return "Los lobos usan sus lenguaje corporal para comunicarse, muestran su " +
                "dominio o sumision, su emociones y estados";
    }
}
