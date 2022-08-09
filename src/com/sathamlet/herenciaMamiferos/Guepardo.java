package com.sathamlet.herenciaMamiferos;

public class Guepardo extends Felino{
    public Guepardo(String habitad, float altura, float largo, float peso,
                    String nombreCientifico, float tamanoGarras, double velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo se alimenta de presas medianas, " +
                "como gacelas, impalas y antilopes. A veces forman coaliciones, " +
                "grupos de dos a cinco ejemplares machos para cazar juntos." + this.getHabitad() + "";
    }

    @Override
    public String dormir() {
        return "Suelen dormir a la interperie, pero en lugares turbios. " +
                "Duermen entre 16 y 18 horas al d[ia y cuando no es asi e" +
                "stan vigilando su territorio de depredadores";
    }

    @Override
    public String correr() {
        return "Son capaces de alcanzar las 60 millas por hora en tres segundos";
    }

    @Override
    public String comunicarse() {
        return "se comunican a traves de senales olfativas";
    }
}
