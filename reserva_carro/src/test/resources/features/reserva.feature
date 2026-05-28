#language: pt

Funcionalidade: Reservar de motorista

Cenário: Reserva dentro da área de cobertura
    Dado o usuário está na cidade "Belo Horizonte"
    Quando o usuário solicita uma reserva
    Então a reserva retorna "Motorista a caminho"

Cenário: Reserva fora da área de cobertura
    Dado o usuário está na cidade "São Paulo"
    Quando o usuário solicita uma reserva
    Então a reserva retorna "Área fora de cobertura" 