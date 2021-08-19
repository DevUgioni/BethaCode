package exemplo_builder;

public class Animal {
    private String nome;
    private String raca;
    private String som;
    private int qtdPatas;

    public Animal(String nome, String raca, String som, int qtdPatas) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
        this.qtdPatas = qtdPatas;
    }

    public Animal(String nome, String raca, String som) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
    }

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }

    public String getSom(String somMais){
        return this.som+" e "+somMais;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
