import java.util.Scanner;

public class Exercicio01Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Exercício 01! Você deseja: 1-Digitar os valores do array OU 2-Ver um array pronto? ");
        int escolha = s.nextInt();

        switch (escolha){
            case 1:
                int[] arrayPosicoes = new int[10];

                for (int i = 0; i< arrayPosicoes.length; i++)
                {
                    System.out.println("Informe um número: ");
                    arrayPosicoes[i] = s.nextInt();
                }

                for (int i = 0; i< arrayPosicoes.length; i++)
                {
                    System.out.println("Valor informado na posição " +i+ ": " +arrayPosicoes[i]);
                }
                break;
            case 2:
                int[] arrayPronto = {1,2,3,4,5,6,7,8,9,10};

                for (int i = 0; i< arrayPronto.length; i++)
                {
                    System.out.println("Valor informado na posição " +i+ ": " +arrayPronto[i]);
                }
                break;
            default:
                System.out.println("ESCOLHA ENTRE AS OPÇÕES 1 E 2");
        }


    }
}
