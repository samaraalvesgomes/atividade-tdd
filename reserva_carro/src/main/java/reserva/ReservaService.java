package com.reserva;

public class ReservaService {
    public String reservar(String cidade, String endereco) {
        // Lógica para reservar um carro
        if (!cidade.equals("Belo Horizonte") && !cidade.equals("Contagem")) {
            throw new IllegalArgumentException("Área fora de cobertura");
        } else {
            return "Motorista a caminho";
        }
    }
}
