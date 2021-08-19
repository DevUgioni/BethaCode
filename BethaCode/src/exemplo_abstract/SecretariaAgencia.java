package exemplo_abstract;

public class SecretariaAgencia extends Secretaria{

    public SecretariaAgencia(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public SecretariaAgencia(String nome) {
        super(nome);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.30;
    }
}
