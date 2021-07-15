package model;

public class PessoaJuridica extends PessoaMain{
    private String cnpj;
    private String inscricaoEstadual;
    private String cnae;

    public PessoaJuridica(Integer idPessoa, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae) {
        super(idPessoa, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnae = cnae;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumentoprincipal() {
        return this.cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }
}

