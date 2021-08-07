package model;

import java.math.BigDecimal;

public class Servico implements Vendavel{
    private Long id;
    private String descricao;
    private BigDecimal valorUnitario;

    @Override
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    public Servico(Long id, String descricao, BigDecimal valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public Servico(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Servico(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
