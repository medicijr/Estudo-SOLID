# 💳 Sistema de Pagamentos - SOLID

Sistema de pagamentos desenvolvido em Java aplicando os 5 princípios do SOLID.

## 📚 Princípios aplicados

- **S (Single Responsibility)** → cada classe com uma única responsabilidade
- **O (Open/Closed)** → novas formas de pagamento sem modificar código existente
- **I (Interface Segregation)** → interface FormaPagamento pequena e específica
- **D (Dependency Inversion)** → PagamentoService depende da abstração, não da implementação

> O princípio L (Liskov) não se aplica diretamente pois o projeto usa 
> interfaces ao invés de herança, mas o design segue a mesma filosofia.

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
