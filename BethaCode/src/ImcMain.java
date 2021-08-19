public class ImcMain {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Davi Ugioni";
        pessoa1.cpf = "192168125";
        pessoa1.altura = 1.70;
        pessoa1.peso = 61.9;
        pessoa1.filiacao = "Mãe Teste";

        pessoa1.getIMC();
        //System.out.println(pessoa1.nome+ ", peso: " +pessoa1.peso+ " e altura " +pessoa1.altura+ " seu IMC é: "+pessoa1.IMC);
    }

    static class Pessoa {
        String nome;
        String cpf;
        String rg;
        Double altura;
        Double peso;
        String dataNascimento;
        String filiacao;
        Double IMC;

        public void getIMC(){
            IMC = peso / Math.pow(altura,2);
            System.out.println("IMC: "+IMC);
        }

        public void academia(){
            peso = peso - 1;
            System.out.println("Novo peso de "+nome+" é "+peso);
        }

    }
}
