public class OrientacaoMain {
        public static void main(String[] args) {

            //Declarando objeto documento1
            Documento documento1;

            //criando objeto documento1
            documento1 = new Documento();

            documento1.codigo = 123456;
            documento1.nome = "Alfredo";
            documento1.foto = "Img1.png";
            documento1.dataNascimento = "20/05/1990";

            System.out.println("Código do documento: "+ documento1.codigo);
        }


    static class Documento {
        //Estado
        String foto; //Nome do arquivo de imagem
        String nome; //Nome da pessoa
        Integer codigo; //Codigo desse documento
        String dataNascimento; //Data Nascimento
    }
}
