package br.com.chronosAcademy.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {
    @Test
    public void validaTerrenoGrande() {
        Logica logica = new Logica();
        logica.getTipoTerreno(101);
        assertEquals("Terreno grande", logica.getTipoTerreno(101));
    }

}