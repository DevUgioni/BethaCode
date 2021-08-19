package exemplo_abstract;

public abstract class Funcionario {
    private String nome;
    private Double bonificacao;

    public Funcionario(String nome, Double bonificacao) {
        this.nome = nome;
        this.bonificacao = bonificacao;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getBonificacao();

    public Double getSalario() {
        return bonificacao;
    }

    public void setBonificacao(Double bonificacao) {
        this.bonificacao = bonificacao;
    }
}
