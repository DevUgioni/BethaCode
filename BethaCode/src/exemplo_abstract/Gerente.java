package exemplo_abstract;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        //return super.getBonificacao() + ((super.getBonificacao()*15)/100);
        return getSalario()*1.15;
    }
}
