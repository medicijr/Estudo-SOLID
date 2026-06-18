package br.com.pagamento;


import br.com.pagamento.model.Pedido;
import br.com.pagamento.payment.Boleto;
import br.com.pagamento.payment.CartaoCredito;
import br.com.pagamento.payment.Pix;
import br.com.pagamento.service.PagamentoService;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(250);

        PagamentoService pix = new PagamentoService(new Pix());
        pix.processar(pedido);

        PagamentoService credito = new PagamentoService(new CartaoCredito());
        credito.processar(pedido);

        PagamentoService boleto = new PagamentoService(new Boleto());
        boleto.processar(pedido);
    }
}
