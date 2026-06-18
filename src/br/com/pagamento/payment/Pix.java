package br.com.pagamento.payment;

public class Pix implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento no Pix confirmado!!");
    }
}
