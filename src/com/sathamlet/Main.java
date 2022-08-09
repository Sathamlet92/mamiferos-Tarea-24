package com.sathamlet;

import com.sathamlet.herenciaMamiferos.Leon;
import com.sathamlet.herenciaMamiferos.Mamifero;

public class Main {
    public static void main(String[] args) {
        Mamifero leon = new Leon("Sabana",
                1.20F, 2.0F, 190F, "Panthera leo",
                2f, 80, 114f, 3);

        System.out.println(leon.detallesMamifero());


    }
}
