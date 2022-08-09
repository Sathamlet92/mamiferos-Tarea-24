package com.sathamlet;

import com.sathamlet.herenciaMamiferos.*;

public class Main {
    public static void main(String[] args) {
        Mamifero leon = new Leon("Sabana",
                1.20F, 2.0F, 190F, "Panthera leo",
                2f, 80, 114f, 3);
        Mamifero guepardo = new Guepardo("Sabana",
                .9f,1.2F,80F,"Acinonyx jubatus", 2.1f, 110f);
        Mamifero tigre = new Tigre("Selva", 1.3f, 1.9f,130f,"Panthera tigris",
                3.5f, 60, "El tigre de Amur");
        Mamifero lobo = new Lobo("Bosques", .80f, 1.6f,45f, "Canis lupus", "Gris", 2.1f, 14, "Lobo Gris");

        Mamifero perro = new Perro("Indefinida", 1.1f,1.3f, 35f,"Canis lupus familiaris", "Blanco", 1.1f, 556);

        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;
        for (var item: mamiferos
             ) {
            System.out.println("item.detallesMamifero() = " + item.detallesMamifero());
            System.out.println();
        }
    }
}
