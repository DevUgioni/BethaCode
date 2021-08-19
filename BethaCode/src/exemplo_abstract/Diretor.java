package exemplo_abstract;

public class Diretor extends Gerente{
    public Diretor(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public Diretor(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.20;
    }
}
