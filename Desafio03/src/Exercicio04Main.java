import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio04Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = s.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = s.nextInt();

        String mensagem = "Nome: "+ nome +", idade: "+idade;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
