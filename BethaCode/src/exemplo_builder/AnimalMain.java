package exemplo_builder;

public class AnimalMain {
    public static void main(String[] args){
        Animal animal = AnimalBuilder.newAnimal("GATO", "FIFI","SIAMÊS","MEOW",3);

        System.out.println("Som: "+animal.getSom());
        System.out.println("Som: "+animal.getSom(" AAAAA"));
    }
}
