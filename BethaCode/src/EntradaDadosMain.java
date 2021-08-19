import java.util.Scanner;

public class EntradaDadosMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("digite uma linha: ");
        String linha = s.nextLine(); //le linha
        System.out.print("digite um número: ");
        int i = s.nextInt(); //le número
        System.out.print("digite um número: ");
        double d = s.nextDouble(); // le ponto flutuante

        System.out.println("Imprime, linha: "+ linha +" inteiro: "+i+" double: "+d);
    }
}
