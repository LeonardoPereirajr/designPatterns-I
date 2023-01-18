package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.Pedido;

import java.util.List;

public class GeraPedidoHandler {

        private List<AcaoAposGerarPedido> acoes;

        public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
            this.acoes = acoes;
        }
        public void execute(GeraPedido dados) {
            Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

            Pedido pedido = new Pedido(dados.getCliente(), orcamento);

            acoes.forEach(a -> a.executarAcao(pedido));
        }

}
