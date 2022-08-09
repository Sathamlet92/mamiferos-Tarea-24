package com.sathamlet;

import com.sathamlet.herenciaMamiferos.Guepardo;
import com.sathamlet.herenciaMamiferos.Leon;
import com.sathamlet.herenciaMamiferos.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero leon = new Leon("Sabana",
                1.20F, 2.0F, 190F, "Panthera leo",
                2f, 80, 114f, 3);
        Mamifero guepardo = new Guepardo("Sabana",
                .9f,1.2F,80F,"Acinonyx jubatus", 2.1f, 110f);

        System.out.println(leon.detallesMamifero());
        System.out.println();
        System.out.println(guepardo.detallesMamifero());


    }
}
