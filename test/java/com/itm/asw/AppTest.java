package com.itm.asw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void deberiaRetornarSaludoConNombre() {
        String resultado = App.saludar("Mateo");
        assertEquals("Hola, Mateo", resultado);
    }

    @Test
    void deberiaRetornarSaludoPorDefectoSiEsVacio() {
        String resultado = App.saludar("");
        assertEquals("Hola, Aplicaciones y Servicios Web", resultado);
    }
}