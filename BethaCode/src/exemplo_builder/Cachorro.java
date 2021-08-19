package exemplo_builder;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, int qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    @Override
    public String getSom() {
        return "O cachorro faz " + super.getSom();
    }
}
