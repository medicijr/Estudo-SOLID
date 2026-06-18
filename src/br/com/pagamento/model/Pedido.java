package br.com.pagamento.model;



public class Pedido {
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Valor total do pedido: "+ valorTotal;
    }
}
