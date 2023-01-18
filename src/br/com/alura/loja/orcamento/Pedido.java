package br.com.alura.loja.orcamento;

public class Pedido {

    private String cliente;

    private Orcamento orcamento;

    public Pedido(String cliente, Orcamento orcamento) {
        this.cliente = cliente;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

}
