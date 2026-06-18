package br.com.pagamento.service;

import br.com.pagamento.model.Pedido;
import br.com.pagamento.payment.FormaPagamento;

public class PagamentoService {
    private FormaPagamento formaPagamento;
    public PagamentoService (FormaPagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }
    public void processar (Pedido pedido){
        formaPagamento.pagar(pedido.getValorTotal());
    }
}
