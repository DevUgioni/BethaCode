package exemplo_abstract;

public class SecretariaAdministrativa extends Secretaria{
    public SecretariaAdministrativa(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public SecretariaAdministrativa(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.40;
    }
}
