package exemplo_heranca;

public class ConstrucaoMain{
    private Double metragem ;
    private Integer qtdeQuartos;
    private Integer qtdeBanheiros;

    public ConstrucaoMain(Double metragem, Integer qtdeQuartos, Integer qtdeBanheiros) {
        this.metragem = metragem;
        this.qtdeQuartos = qtdeQuartos;
        this.qtdeBanheiros = qtdeBanheiros;
    }

    public Double getMetragem() {
            return metragem;
        }

    public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

    public Integer getQtdeQuartos() {
            return qtdeQuartos;
        }

    public void setQtdeQuartos(Integer qtdeQuartos) {
            this.qtdeQuartos = qtdeQuartos;
        }

    public Integer getQtdeBanheiros() {
            return qtdeBanheiros;
        }

    public void setQtdeBanheiros(Integer qtdeBanheiros) {
            this.qtdeBanheiros = qtdeBanheiros;
        }
}
