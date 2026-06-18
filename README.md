# 💳 Sistema de Pagamentos - SOLID

Sistema de pagamentos desenvolvido em Java aplicando os 5 princípios do SOLID.

## 📚 Princípios aplicados

- **S (Single Responsibility)** → cada classe com uma única responsabilidade: `Pedido` guarda dados, `PagamentoService` processa, cada forma de pagamento cuida de si mesma
- **O (Open/Closed)** → novas formas de pagamento podem ser adicionadas sem modificar nenhuma classe existente
- **D (Dependency Inversion)** → `PagamentoService` depende da interface `FormaPagamento`, nunca de uma implementação concreta

## 🗂️ Estrutura do projeto

    src/
    └── br/
        └── com/
            └── pagamento/
                ├── model/
                │   └── Pedido.java
                ├── payment/
                │   ├── FormaPagamento.java
                │   ├── Pix.java
                │   ├── CartaoCredito.java
                │   └── Boleto.java
                ├── service/
                │   └── PagamentoService.java
                └── Main.java

## ⚙️ Funcionalidades

- Criação de pedidos com valor total
- Processamento de pagamento via Pix
- Processamento de pagamento via Cartão de Crédito
- Processamento de pagamento via Boleto
- Adição de novas formas de pagamento sem alterar código existente

## 🚀 Como rodar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Rode a classe `Main.java`

## 🛠️ Tecnologias

- Java 21
- IntelliJ IDEA

## 📝 Sobre este projeto

Este é um projeto de estudo focado em fixar os princípios SOLID na prática, 
parte de uma jornada de aprendizado em Java rumo a uma vaga júnior.
