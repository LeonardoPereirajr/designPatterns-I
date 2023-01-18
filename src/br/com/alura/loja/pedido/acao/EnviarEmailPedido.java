package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.orcamento.Pedido;
import br.com.alura.loja.pedido.AcaoAposGerarPedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

        public void executar(Pedido pedido) {
            System.out.println("Enviando email com dados do pedido");
        }

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido de " + pedido.getCliente());
    }
}
