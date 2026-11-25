package com.itm.asw;

public class App {

    public static void main(String[] args) {
        System.out.println(saludar("ITM ASW"));
    }

    public static String saludar(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            return "Hola estudiante";
        }
        return "Hola, " + nombre.trim();
    }

    public static int sumar(int a, int b) {
        return a + b;
    }
}