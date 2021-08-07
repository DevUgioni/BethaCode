package model;

import java.math.BigDecimal;

public class Vendedor extends AbstractPessoa{
    private BigDecimal percentualComissao;

    public Vendedor(long id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, endereco, telefone);
    }

    public Vendedor(long id, String nome, String cpf, String endereco) {
        super(id, nome, cpf, endereco);
    }

    public Vendedor(long id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Vendedor(long id, String nome) {
        super(id, nome);
    }

    public Vendedor(long id) {
        super(id);
    }

    public BigDecimal getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(BigDecimal percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
