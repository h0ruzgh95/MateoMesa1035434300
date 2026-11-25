package com.itm.asw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void deberiaSaludarConNombre() {
        assertEquals("Hola, Mateo", App.saludar("Mateo"));
    }

    @Test
    void deberiaSumarDosEnteros() {
        assertEquals(15, App.sumar(10, 5));
    }
}