public class ArquitetoSoft extends Funcionario{

    public ArquitetoSoft(int id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public ArquitetoSoft(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArquitetoSoft(int id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto()+ ((super.getSalarioBruto()*15)/100);
    }
}
