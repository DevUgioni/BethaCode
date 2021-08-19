public class VetorMain {
    public static void main(String[] args){
        int[] jogoSena;
        int[] outroJogoSena = {23,12,55,02,07,19};

        jogoSena = new int[6];

        jogoSena[0] = 23;
        jogoSena[1] = 12;
        jogoSena[2] = 55;
        jogoSena[3] = 02;
        jogoSena[4] = 07;
        jogoSena[5] = 19;

        for ( int x = 0; x < jogoSena.length; x++ ) {
            System.out.println(jogoSena[x]);
            System.out.println(outroJogoSena[x]);
        }
    }
}
