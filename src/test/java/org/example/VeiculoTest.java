package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void testCalcularCusto() {
        Veiculo veiculo = new Veiculo("Fiat Uno", 100.0);

        // Teste sem desconto
        assertEquals(300.0, veiculo.calcularCusto(3), 0.001);

        // Teste com desconto (7+ dias)
        assertEquals(630.0, veiculo.calcularCusto(7), 0.001); // 700 - 70 (10%)
        assertEquals(900.0, veiculo.calcularCusto(10), 0.001); // 1000 - 100 (10%)
    }

    @Test
    void testDesconto() {
        Veiculo veiculo = new Veiculo("Ford Ka", 150.0);

        assertEquals(0, veiculo.desconto(1), 0.001);
        assertEquals(0, veiculo.desconto(6), 0.001);
        assertEquals(105.0, veiculo.desconto(7), 0.001); // 150*7*0.10
        assertEquals(150.0, veiculo.desconto(10), 0.001); // 150*10*0.10
    }

    @Test
    void testCalcularMulta() {
        Veiculo veiculo = new Veiculo("VW Gol", 200.0);

        // Sem atraso
        assertEquals(0, veiculo.calcularMulta(5, 5), 0.001);

        // Com atraso
        assertEquals(400.0, veiculo.calcularMulta(5, 6), 0.001); // 1 dia de atraso
        assertEquals(1200.0, veiculo.calcularMulta(3, 6), 0.001); // 3 dias de atraso
    }

    @Test
    void testValidacoes() {
        // Teste de validação no construtor
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("Chevrolet Onix", -100.0));

        Veiculo veiculo = new Veiculo("Renault Sandero", 120.0);

        // Teste de validação no cálculo
        assertThrows(IllegalArgumentException.class, () -> veiculo.calcularCusto(0));
        assertThrows(IllegalArgumentException.class, () -> veiculo.calcularCusto(-5));

        // Teste de validação no setter
        assertThrows(IllegalArgumentException.class, () -> veiculo.setValorDiaria(0));
    }
}