package model;

public class Cliente extends PessoaFisica{
    private Double limiteCred;
    private Double limiteUsado;

    public Cliente(Integer idPessoa, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCred, Double limiteUsado) {
        super(idPessoa, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCred = limiteCred;
        this.limiteUsado = limiteUsado;
    }

    public Double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(Double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public Double getLimiteUsado() {
        return limiteUsado;
    }

    public void setLimiteUsado(Double limiteUsado) {
        this.limiteUsado = limiteUsado;
    }

    public void aumentaLimite(){
        limiteCred = limiteCred + 100.0;
    }

    public void reduzLimite(){
        limiteCred = limiteCred - 100.0;
    }
}
