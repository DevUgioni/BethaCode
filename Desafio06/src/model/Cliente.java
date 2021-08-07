package model;

import java.math.BigDecimal;

public class Cliente extends AbstractPessoa{
    private BigDecimal percentualDescontoMaximo;

    public Cliente(long id, String nome, String cpf, String endereco, String telefone) {
        super(id, nome, cpf, endereco, telefone);
    }

    public Cliente(long id, String nome, String cpf, String endereco) {
        super(id, nome, cpf, endereco);
    }

    public Cliente(long id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Cliente(long id, String nome) {
        super(id, nome);
    }

    public Cliente(long id) {
        super(id);
    }

    public BigDecimal getPercentualDescontoMaximo() {
        return percentualDescontoMaximo;
    }

    public void setPercentualDescontoMaximo(BigDecimal percentualDescontoMaximo) {
        this.percentualDescontoMaximo = percentualDescontoMaximo;
    }
}
