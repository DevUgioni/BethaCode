public class AnimalMain {

    public static void main (String[] args) {

        Animal animal1 = new Animal();
        animal1.nome = "Gato";
        animal1.peso = 60.0;
        animal1.altura = 0.8;
        animal1.som = "MEOOOOOOOOOOOOOOOOOOOOOOOW";

        animal1.emitirSom();
        animal1.animalPula(10.0);
    }

    public static class Animal {

        String nome;
        Double peso;
        Double altura;
        String som;

        public void emitirSom(){
            System.out.println("O animal faz "+som);
        }

        public void animalPula(Double alturaPulo){
            System.out.println("O animal pula "+alturaPulo+" altura!");
        }
    }
}
