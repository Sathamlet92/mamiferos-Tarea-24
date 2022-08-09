package com.sathamlet.herenciaMamiferos;

public class TIgre extends Felino {
    private String especieTigre;

    public TIgre(String habitad, float altura, float largo, float peso,
                 String nombreCientifico, float tamanoGarras, double velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public TIgre(String habitad, float altura, float largo, float peso,
                 String nombreCientifico, float tamanoGarras, double velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public void setEspecieTigre(String especieTigre) {
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "Los tigres son cazadores solitarios y sigilosos";
    }

    @Override
    public String dormir() {
        return "Los tigres duermen aproximandamente 18 a 20 horas";
    }

    @Override
    public String correr() {
        return "Los tigres solo alcanzan una velocidad de :" + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "Al igual que sus primos los leones los tigres alcanzan un rugido de 114dB";
    }
}
