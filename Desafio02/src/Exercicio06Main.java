public class Exercicio06Main {
    public static void main(String[] args) {

        //Programa que imprima os quadrados dos números inteiros ímpares entre 15 e 35.

        int i = 15;
        int quadrado = 0;

        while (i<=35){
            if (i%2 != 0){
                quadrado = i*i;
                System.out.println("O quadrado de "+ i +" é igual a: "+ quadrado);
            }
            i++;
        }
    }
}
