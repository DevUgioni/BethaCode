public class Exercicio03Main {
    public static void main(String[] args) {
        int[] arrayPronto = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayInverso = new int[10];

        for (int i = 0; i< arrayPronto.length; i++)
        {
            int valor = arrayPronto[arrayPronto.length - 1 - i];
            arrayInverso[i] = valor;
            System.out.println("Valor informado na posição " +i+ ": " +arrayInverso[i]);
        }
    }
}
