package com.reserva;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import org.junit.jupiter.api.Assertions;

public class ReservaSteps {

    private ReservaService reservaService = new ReservaService();
    private String cidade;
    private String resultado;

    @Dado("o usuário está na cidade {string}")
    public void oUsuarioEstaNaCidade(String cidade) {
        this.cidade = cidade;
    }

    @Quando("o usuário solicita uma reserva")
    public void oUsuarioSolicitaUmaReserva() {
        try {
            this.resultado = reservaService.reservar(cidade, "Rua A, 123");
        } catch (IllegalArgumentException e) {
            this.resultado = e.getMessage();
        }
    }

    @Então("a reserva retorna {string}")
    public void aReservaRetorna(String esperado) {
        Assertions.assertEquals(esperado, resultado);
    }
}