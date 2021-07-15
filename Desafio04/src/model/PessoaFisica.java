package model;

public class PessoaFisica extends PessoaMain{
    private String cpf;
    private String rg;
    private String sexo;

    public PessoaFisica(Integer idPessoa, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
        super(idPessoa, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocumentoprincipal() {
        return this.cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
