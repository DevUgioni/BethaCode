public class CalculadoraMain {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.calcular(10.0, 3.0);
        calc.calcular("15", "22");
        calc.calcular(11,12);
    }


    public static class Calculadora {
        public void calcular(Integer a, Integer b) {
            Integer soma = a+b;
            System.out.println(soma);
        }

        public void calcular(Double a, Double b) {
            Double soma = a + b;
            System.out.println(soma);
        }

        public void calcular(String a, String b) {
            String soma = a + b;
            System.out.println(soma);
        }
    }
}
