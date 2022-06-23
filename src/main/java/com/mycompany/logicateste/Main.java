package com.mycompany.logicateste;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Universo");

            } else if (i % 3 == 0) {
                System.out.println("Uni");
            } else if (i % 5 == 0) {
                System.out.println("Verso");
            } else {
                System.out.println("" + i);
            }

        }
    }
}
