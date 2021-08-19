package exemplo_builder;

public class Gato extends Animal{
    public Gato(String nome, String raca, String som, int qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    @Override
    public String getSom() {
        return "O gato faz " + super.getSom();
    }
}
