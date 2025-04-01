package org.example;

import org.example.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Criando alguns veículos
        Veiculo carroEconomico = new Veiculo("Fiat Mobi", 80.0);
        Veiculo carroIntermediario = new Veiculo("VW Polo", 120.0);
        Veiculo carroPremium = new Veiculo("Audi A3", 250.0);

        // Demonstração de cálculos
        System.out.println("=== Sistema de Locadora de Veículos ===");
        System.out.println("\nAluguel de 3 dias:");
        System.out.printf("Fiat Mobi: R$ %.2f%n", carroEconomico.calcularCusto(3));
        System.out.printf("VW Polo: R$ %.2f%n", carroIntermediario.calcularCusto(3));
        System.out.printf("Audi A3: R$ %.2f%n", carroPremium.calcularCusto(3));

        System.out.println("\nAluguel de 10 dias (com desconto):");
        System.out.printf("Fiat Mobi: R$ %.2f (desconto: R$ %.2f)%n",
                carroEconomico.calcularCusto(10),
                carroEconomico.desconto(10));
        System.out.printf("VW Polo: R$ %.2f (desconto: R$ %.2f)%n",
                carroIntermediario.calcularCusto(10),
                carroIntermediario.desconto(10));

        System.out.println("\nSimulação de atraso (contrato 5 dias, usado 7 dias):");
        System.out.printf("Multa Fiat Mobi: R$ %.2f%n", carroEconomico.calcularMulta(5, 7));
        System.out.printf("Multa Audi A3: R$ %.2f%n", carroPremium.calcularMulta(5, 7));

        // Testando validações
        try {
            Veiculo veiculoInvalido = new Veiculo("Modelo Inválido", -100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro capturado: " + e.getMessage());
        }
    }
}