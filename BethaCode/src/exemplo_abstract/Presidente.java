package exemplo_abstract;

public class Presidente extends Funcionario{
    public Presidente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public Presidente(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        //return super.getBonificacao() + ((super.getBonificacao()*10)/100);
        return getSalario()*1.10;
    }
}
