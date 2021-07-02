import java.util.Scanner;

public class Exercicio05Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] arrayPosicoes = new int[10];
        int[] arrayInverso = new int[10];

        for (int i = 0; i< arrayPosicoes.length; i++)
        {
            System.out.println("Informe um número: ");
            arrayPosicoes[i] = s.nextInt();
        }

        for (int i = 0; i< arrayPosicoes.length; i++)
        {
            int valor = arrayPosicoes[arrayPosicoes.length - 1 - i];
            arrayInverso[i] = valor;
            System.out.println("Valor informado na posição " +i+ ": " +arrayInverso[i]);
        }
    }
}
