public class CasaMain {
    public static void main (String[] args) {
        Casa casa = new Casa("Rua 1",4,1,2,120.2);

        casa.setMetragem(135.0);

        if (casa.getMetragem()>120.0){
            System.out.println("Casa do Carrion!!");
        }

        System.out.println(casa);
    }

    public static class Casa{
        private String endereco;
        private Integer quartos;
        private Integer salas;
        private Integer banheiros;
        private Double metragem;

        public Casa(String endereco, Integer quartos, Integer salas, Integer banheiros, Double metragem) {
            this.endereco = endereco;
            this.quartos = quartos;
            this.salas = salas;
            this.banheiros = banheiros;
            this.metragem = metragem;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public int getQuartos() {
            return quartos;
        }

        public void setQuartos(Integer quartos) {
            this.quartos = quartos;
        }

        public int getSalas() {
            return salas;
        }

        public void setSalas(Integer salas) {
            this.salas = salas;
        }

        public int getBanheiros() {
            return banheiros;
        }

        public void setBanheiros(Integer banheiros) {
            this.banheiros = banheiros;
        }

        public Double getMetragem() {
            return metragem;
        }

        public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", quartos=" + quartos +
                    ", salas=" + salas +
                    ", banheiros=" + banheiros +
                    ", metragem=" + metragem +
                    '}';
        }
    }
}
