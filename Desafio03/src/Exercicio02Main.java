import java.util.Arrays;
import java.util.Scanner;

public class Exercicio02Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] arrayMedia = new int[5];

        for (int i = 0; i< arrayMedia.length; i++)
        {
            System.out.println("Informe um número inteiro: ");
            arrayMedia[i] = s.nextInt();
        }

        double media = Arrays.stream(arrayMedia).sum()/arrayMedia.length;

        System.out.println("Média dos valores digitados: "+ media);

    }
}
