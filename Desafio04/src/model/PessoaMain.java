package model;

public class PessoaMain {
    private Integer idPessoa;
    private String nome;
    private String endereco;
    private String telefone;
    private String documentoprincipal;

    public PessoaMain(Integer idPessoa, String nome, String endereco, String telefone) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumentoprincipal() {
        return documentoprincipal;
    }

    public void setDocumentoprincipal(String documentoprincipal) {
        this.documentoprincipal = documentoprincipal;
    }
}
