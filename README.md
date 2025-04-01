# 🚗💨 **Sistema de Locadora de Veículos**  

<div align="center">
  


✨ **Sistema completo para gerenciamento de aluguel de veículos** ✨  

[![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=java)](https://www.java.com/)
[![JUnit5](https://img.shields.io/badge/JUnit-5-brightgreen?logo=junit5)](https://junit.org/junit5/)


</div>  

---

## 📋 **Funcionalidades Principais**  

✅ **Cálculo de Aluguel**  
- Valor baseado em diárias  
- Desconto automático de **10%** para períodos ≥ 7 dias  

🚨 **Multas por Atraso**  
- Cobrança de **2x o valor da diária** por dia de atraso  

🧪 **Testes Unitários**  
- Validação de cenários normais e extremos  
- Cobertura de **100%** dos métodos principais  

---

## ⚙️ **Como Executar**  

### **Pré-requisitos**  
- Java JDK 17+  
- Maven (opcional)  

### **Passo a Passo**  

1. **Clone o repositório**  
   ```bash
   git clone https://github.com/seu-usuario/locadora-veiculos.git
   cd locadora-veiculos
   ```

2. **Compile e execute**  
   ```bash
   javac -d bin src/main/java/Veiculo.java src/main/java/Main.java
   java -cp bin Main
   ```

3. **Rodar testes**  
   ```bash
   javac -d bin -cp lib/junit-platform-console-standalone-1.9.3.jar src/test/java/VeiculoTest.java
   java -jar lib/junit-platform-console-standalone-1.9.3.jar --class-path bin --scan-class-path
   ```

---

## 📊 **Exemplo de Saída**  

```plaintext
=== Sistema de Locadora de Veículos ===

🚗 Aluguel de 3 dias:
- Fiat Mobi: R$ 240,00
- VW Polo: R$ 360,00
- Audi A3: R$ 750,00

🎉 Aluguel de 10 dias (com desconto):
- Fiat Mobi: R$ 720,00 (economize R$ 80,00!)
- VW Polo: R$ 1080,00 (economize R$ 120,00!)

⚠️ Simulação de atraso (contrato 5 dias, usado 7 dias):
- Multa Fiat Mobi: R$ 320,00
- Multa Audi A3: R$ 1000,00
```

---

## � **Testes Unitários**  

| Método Testado | Cenários Validados | Status |
|---------------|-------------------|--------|
| `calcularCusto()` | Dias normais, com desconto, zero dias | ✅ |
| `desconto()` | Limiar de 7 dias, valores extremos | ✅ |
| `calcularMulta()` | Sem atraso, 1 dia de atraso, múltiplos dias | ✅ |

---

## 📜 **Estrutura do Projeto**  

```
locadora-veiculos/
├── src/
│   ├── main/java/
│   │   ├── Veiculo.java       # Classe principal
│   │   └── Main.java         # Demonstração
│   └── test/java/
│       └── VeiculoTest.java   # Testes unitários
├── lib/                      # Dependências JUnit
└── README.md                 # Este arquivo
```

---

## 🤝 **Como Contribuir**  

1. **Faça um Fork** do projeto  
2. **Crie uma Branch**  
   ```bash
   git checkout -b minha-feature
   ```
3. **Commit suas Mudanças**  
   ```bash
   git commit -m "Adiciona nova funcionalidade"
   ```
4. **Push para a Branch**  
   ```bash
   git push origin minha-feature
   ```
5. **Abra um Pull Request**  

---

## 📄 **Licença**  

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.  

---

<div align="center">
  
✨ **Feito com ❤️ para a disciplina de POO** ✨  

</div>  

---

### 🔍 **Dúvidas?**  
Abra uma [issue](https://github.com/seu-usuario/locadora-veiculos/issues) no repositório!  

--- 
