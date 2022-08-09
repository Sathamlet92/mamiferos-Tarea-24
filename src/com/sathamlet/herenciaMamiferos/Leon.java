package com.sathamlet.herenciaMamiferos;

public class Leon extends Felino{

    private int numeroManada;
    private float potencialRugidoDecibel;

    public Leon(String habitad, float altura, float largo, float peso, String nombreCientifico,
                float tamanoGarras, double velocidad, float potencialRugidoDecibel, int numeroManada) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.potencialRugidoDecibel = potencialRugidoDecibel;
        this.numeroManada = numeroManada;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public float getPotencialRugidoDecibel() {
        return potencialRugidoDecibel;
    }



    @Override
    public String comer() {
        return "El leon caza con su manada que son un total de: " + this.getNumeroManada()
                + " felinos en " + this.getHabitad();
    }

    @Override
    public String dormir() {
        return "Solo duerme sistas cortas y esporadicas para " +
                "poder estar descansados cuando se les presente la oportunidad de comer";
    }

    @Override
    public String correr() {
        return "EL leon en persecusion puede alcanzar: " + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "Los leones al rugir pueden alcanzar hasta: " + this.getPotencialRugidoDecibel();
    }
}
