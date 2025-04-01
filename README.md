# Sistema de Locadora de Veículos

Este projeto implementa um sistema básico para cálculo de aluguel de veículos com:
- Cálculo de custo baseado em diárias
- Aplicação de descontos para períodos longos
- Cálculo de multas por atraso na devolução

## Funcionalidades

- `calcularCusto(int dias)`: Calcula o valor total do aluguel
- `desconto(int dias)`: Aplica desconto de 10% para aluguéis de 7+ dias
- `calcularMulta(int diasContratados, int diasUtilizados)`: Calcula multa por atraso (2x diária/dia)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/locadora-veiculos.git
