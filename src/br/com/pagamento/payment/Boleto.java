package br.com.pagamento.payment;

public class Boleto implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no Boleto confirmado!!");
    }
}
