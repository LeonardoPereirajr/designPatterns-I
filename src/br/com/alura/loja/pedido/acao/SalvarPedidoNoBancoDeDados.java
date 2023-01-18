package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.orcamento.Pedido;
import br.com.alura.loja.pedido.AcaoAposGerarPedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

        public void executar(Pedido pedido) {
            System.out.println("Salvando pedido no banco de dados");
        }


    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando no banco de dados pedido de "+ pedido.getCliente());
    }
}
