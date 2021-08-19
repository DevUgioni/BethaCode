package exemplo_abstract;

public abstract class Secretaria extends Funcionario{
    public Secretaria(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public Secretaria(String nome) {
        super(nome);
    }
}

