package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.Pedido;

import java.math.BigDecimal;

public class GeraPedido {

        private String cliente;
        private BigDecimal valorOrcamento;
        private int quantidadeItens;

        public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
            this.cliente = cliente;
            this.valorOrcamento = valorOrcamento;
            this.quantidadeItens = quantidadeItens;
        }
        public void executar() {
            Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
            String cliente = "Alura";

            Pedido pedido = new Pedido(cliente, orcamento);

            System.out.println("");
            System.out.println("Salvando pedido do cliente " + cliente);
        }

        public String getCliente() {
            return cliente;
        }

        public BigDecimal getValorOrcamento() {
            return valorOrcamento;
        }

        public int getQuantidadeItens() {
            return quantidadeItens;
        }

}
