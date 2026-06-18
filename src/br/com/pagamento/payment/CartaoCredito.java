package br.com.pagamento.payment;


public class CartaoCredito implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no Credito confirmado!!");
    }
}
