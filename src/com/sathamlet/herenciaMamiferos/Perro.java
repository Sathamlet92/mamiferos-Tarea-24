package com.sathamlet.herenciaMamiferos;

public class Perro extends Canino{
    private int fuerzaMordida;
    public Perro(String habitad, float altura, float largo, float peso,
                 String nombreCientifico, String color, float tamColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamColmillos);
    }

    public Perro(String habitad, float altura, float largo, float peso,
                 String nombreCientifico, String color, float tamColmillos, int fuerzaMordida) {
        this(habitad, altura, largo, peso, nombreCientifico, color, tamColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(int fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros al igual que todos los caninos son carniboros carronieros";
    }

    @Override
    public String dormir() {
        return "Dependiendo de su edad y raza pueden tomar siestas cortas o largas";
    }

    @Override
    public String correr() {
        return "Los perros pueden correr hasta 45km/h";
    }

    @Override
    public String comunicarse() {
        return "Al igual que muchos caninos los perros usan su lenguaje personal";
    }
}
