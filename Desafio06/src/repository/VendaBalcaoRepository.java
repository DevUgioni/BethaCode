package repository;

public class VendaBalcaoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.print("Listando por ID");
    }

    @Override
    public void findAll() {
        System.out.print("Listando");
    }
}