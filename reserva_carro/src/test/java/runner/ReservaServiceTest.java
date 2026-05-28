package com.reserva;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReservaServiceTest {

    @Test
    public void testeReservaValida() {
        ReservaService reservaService = new ReservaService();
        String resultado = reservaService.reservar("Belo Horizonte", "Rua A, 123");
        assertEquals("Motorista a caminho", resultado);
    }

    @Test
    public void testeReservaForaDeCobertura() {
        ReservaService reservaService = new ReservaService();
        assertThrows(IllegalArgumentException.class, () -> {
            reservaService.reservar("São Paulo", "Rua B, 456");
        });
    }
}