package exemplo_builder;

public class AnimalBuilder {
    public static Animal newAnimal (String filho, String nome, String raca, String som, int qtdPatas){
        if (filho.equals("GATO")){
            return new Gato(nome, raca, som, qtdPatas);
        }
        if (filho.equals("CACHORRO")){
            return new Cachorro(nome, raca, som, qtdPatas);
        }
        if (filho.equals("JACARE")){
            return new Jacare(nome, raca, som, qtdPatas);
        }
        return new Animal(nome, raca, som, qtdPatas);
    }
}
