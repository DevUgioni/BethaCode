package model;

public class Fornecedor extends PessoaJuridica{
    private String responsavel;
    private String obs;

    public Fornecedor(Integer idPessoa, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae, String responsavel, String obs) {
        super(idPessoa, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
        this.responsavel = responsavel;
        this.obs = obs;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
}
