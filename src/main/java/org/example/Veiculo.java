package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("Valor da diária deve ser positivo");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    /**
     * Calcula o custo total do aluguel
     * @param dias Quantidade de dias do aluguel
     * @return Custo total com desconto aplicado (se houver)
     */
    public double calcularCusto(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException("Dias de aluguel devem ser positivos");
        }

        double custo = valorDiaria * dias;
        return custo - desconto(dias);
    }

    /**
     * Calcula o desconto conforme a política da locadora
     * @param dias Quantidade de dias do aluguel
     * @return Valor do desconto (10% para 7+ dias)
     */
    public double desconto(int dias) {
        if (dias >= 7) {
            return valorDiaria * dias * 0.10;
        }
        return 0;
    }

    /**
     * Calcula multa por atraso na devolução
     * @param diasContratados Dias originais do contrato
     * @param diasUtilizados Dias que o veículo ficou alugado
     * @return Valor da multa (2x diária por dia de atraso)
     */
    public double calcularMulta(int diasContratados, int diasUtilizados) {
        if (diasUtilizados > diasContratados) {
            int diasAtraso = diasUtilizados - diasContratados;
            return diasAtraso * valorDiaria * 2;
        }
        return 0;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("Valor da diária deve ser positivo");
        }
        this.valorDiaria = valorDiaria;
    }
}