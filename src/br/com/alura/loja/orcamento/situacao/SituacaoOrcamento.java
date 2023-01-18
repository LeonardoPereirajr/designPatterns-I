package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento ja esta em estado de aprovacao");
    }
    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode sere reprovado");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado");
    }
}
