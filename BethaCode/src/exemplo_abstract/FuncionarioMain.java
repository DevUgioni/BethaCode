package exemplo_abstract;

public class FuncionarioMain {
    public static void main (String[] args){
        Diretor diretor = new Diretor("Douglas",1300.00);

        System.out.println("BONIF: "+diretor.getBonificacao());
    }
}
