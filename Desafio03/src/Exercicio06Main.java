import javax.swing.*;

public class Exercicio06Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o seu nome: ");
        String peso = JOptionPane.showInputDialog("Informe o seu peso: ");
        String altura = JOptionPane.showInputDialog("Informe o sua altura: ");

        double  IMC = Integer.parseInt(peso) / Math.pow(Double.parseDouble(altura),2);
        String mensagem = nome+", seu IMC é: "+IMC;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
