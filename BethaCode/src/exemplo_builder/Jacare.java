package exemplo_builder;

public class Jacare extends Animal{
    public Jacare(String nome, String raca, String som, int qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    @Override
    public String getSom() {
        return "O jacaré faz " + super.getSom();
    }
}
