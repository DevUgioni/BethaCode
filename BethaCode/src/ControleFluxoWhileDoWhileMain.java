public class ControleFluxoWhileDoWhileMain {

    public static void main(String[] args){
        int x = 10;

        while (x<10){
            System.out.println("Item "+x);
            x++;
        }

        int y = 10;

        do{
            System.out.println("Item "+y);
            y++;
        } while (y<10);
    }
}
