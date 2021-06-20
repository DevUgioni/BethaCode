import java.util.Scanner;

public class Exercicio04Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número de até 4 dígitos: ");
        int num = s.nextInt();

        int invertido = 0;
        int resto = 0;

        if (num <= 9999 && num>= -9999) {
            while (num > 0) {
                resto = num % 10;
                invertido = (invertido * 10) + resto;
                num /= 10; //num = num/10;
            }

            System.out.println("Número invertido: " + invertido);
            /// ex 1234 = 4321
        } else {
            System.out.println("ERRO! O número deve ter até 4 DIGITOS.");
        }
    }
}
