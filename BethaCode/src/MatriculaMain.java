public class MatriculaMain {

    public static void main(String[] args) {
        Matricula mat1 = MatriculaBuilder.criaMatricula("Estagiario");
        mat1.setSalario(1000.0);
        System.out.println(mat1.getSalario());
    }
    public static class Matricula {
        private String tipoMatricula;
        private Double Salario;

        public String getTipoMatricula() {
            return tipoMatricula;
        }

        public void setTipoMatricula(String tipoMatricula) {
            this.tipoMatricula = tipoMatricula;
        }

        public Double getSalario() {
            return Salario;
        }

        public void setSalario(Double salario) {
            Salario = salario;
        }
    }

    public static class Funcionario extends Matricula{
        /*    public Funcionario(){
            setTipoMatricula("Funcionario");
        }  redundante*/

        @Override
        public Double getSalario() {
            return super.getSalario()+((super.getSalario()*10)/100);
        }
    }

    public static class Estagiario extends Matricula{
        /*public Estagiario(){
            setTipoMatricula("Estagiario");
        } redundante*/

        @Override
        public Double getSalario() {
            return super.getSalario() + ((super.getSalario()*20)/100);
        }
    }

    public static class MatriculaBuilder {
        public static Matricula criaMatricula(String tipoMatricula) {
            if (tipoMatricula.equals("Estagiario")) {
                return new Estagiario();
            } else {
                return new Funcionario();
            }
        }
    }
}
