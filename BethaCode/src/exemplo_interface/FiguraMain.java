package exemplo_interface;

public class FiguraMain {
    public static void main (String[] args){
        Quadrado quadradinho = new Quadrado(2);

        System.out.println(quadradinho.getNomeFigura()+" área: "+quadradinho.getArea()+" perímetro: "+quadradinho.getPerimetro());

        Triangulo trilegal = new Triangulo(10,2,10,10,10);

        System.out.println(trilegal.getNomeFigura()+" área: "+trilegal.getArea()+" perímetro: "+trilegal.getPerimetro());

    }
}
