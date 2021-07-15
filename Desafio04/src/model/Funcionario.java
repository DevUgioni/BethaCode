package model;

public class Funcionario extends PessoaFisica{
    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(Integer idPessoa, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(idPessoa, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void aplicaDissidio(){
        salarioBruto = salarioBruto + ((salarioBruto*10)/100);
    }
}
