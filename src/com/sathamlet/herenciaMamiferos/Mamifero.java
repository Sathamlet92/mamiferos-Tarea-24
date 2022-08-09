package com.sathamlet.herenciaMamiferos;

abstract public class Mamifero {
    protected String habitad;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;

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

    public String getHabitad() {
        return habitad;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String detallesMamifero() {
        StringBuilder sb = new StringBuilder();
        if(this instanceof Felino){
            sb.append("Estos felinos");
        } else if (this instanceof Canino) {
            sb.append("Estos caninos");
        }
        sb.append(" viven en el habitad conocido como ").append(this.getHabitad()).append("\npueden medir de alto ")
                .append(this.getAltura()).append("m, y tener un largo de ").append(this.getLargo())
                .append("m,\npueden pesar ").append(this.getPeso()).append("kg,\nsu nombre cientifico es: ")
                .append(this.getNombreCientifico());
        if(this instanceof Felino){
            sb.append("\ny alcanzan una velocidad de: ")
                    .append(((Felino) this).getVelocidad())
                    .append("Km/h");
            if(this instanceof Leon){
                sb.append("\nTienen un tamanio de garras: ").append(((Leon) this).getTamanoGarras())
                        .append("\ny un potencial de rugido ").append(((Leon) this).getPotencialRugidoDecibel())
                        .append("dB");
            } else if (this instanceof Tigre) {
                sb.append("\nEspecie: ").append(((Tigre) this).getEspecieTigre());
            }
        } else if (this instanceof Canino) {
            sb.append("\nTienen un color de pelaje ").append(((Canino) this).getColor())
                    .append(",\nun tamnio de colmillos ").append(((Canino) this).getTamColmillos());
            if(this instanceof Lobo){
                sb.append("\nEs de la especie ").append(((Lobo) this).getEspecieLobo())
                        .append("\ny su camada fue de ").append(((Lobo) this).getNumCamada())
                        .append(" cachorros");
            } else if (this instanceof Perro) {
                sb.append("\nTiene una fuerza de moridad de ").append(((Perro) this).getFuerzaMordida());
            }
        }
        return sb.toString();
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}
