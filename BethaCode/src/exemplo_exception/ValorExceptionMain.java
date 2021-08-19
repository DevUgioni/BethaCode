package exemplo_exception;

import java.util.Scanner;

public class ValorExceptionMain {
    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scanner.nextInt();

        try {
            if (num<3){
                ValorMenorQueOPermitidoException str = new ValorMenorQueOPermitidoException("Valor menor que 3!");
                throw str;
            }
            else if (num>10){
                ValorMaiorQueOPermitidoException str = new ValorMaiorQueOPermitidoException("Valor maior que 10!");
                throw str;
            } else {
                System.out.println(num);
            }
        } catch (Exception e) {
            System.out.println("REGRA:"+ e.getMessage());
        }
    }
}
