import java.util.Scanner;

public class Exercicio05Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a área do trapézio: ");
        double h = s.nextDouble();
        System.out.print("Digite a base menor do trapézio: ");
        double bMenor = s.nextDouble();
        System.out.print("Digite a base maior do trapézio: ");
        double bMaior = s.nextDouble();

        double areaTrapezio = 0;

        areaTrapezio = (h*(bMenor+bMaior))/2;
        System.out.println("Área do trapézio: "+areaTrapezio);
    }
}
