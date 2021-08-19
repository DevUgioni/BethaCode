package exemplo_map;

import java.util.*;

public class ClienteMain {
    public static void main(String[] args){

        //LIST
        List<Cliente> cli = new ArrayList<Cliente>();

        Cliente a = new Cliente(1,"Davi","123458224","6993214");
        Cliente b = new Cliente(2,"Dilned","321854422","6993215");
        Cliente c = new Cliente(3,"Cladia","854123455","6993216");

        cli.add(a);
        cli.add(b);
        cli.add(c);

        Cliente cliente;
        System.out.println(cli);
        Iterator<Cliente> itr = cli.iterator();
        while (itr.hasNext()){
            cliente = itr.next();
            System.out.println(cliente.getNome());
        }

        //SET
        Set<Cliente> cliset = new HashSet<Cliente>();
        cliset.add(a);
        cliset.add(b);
        cliset.add(c);

        System.out.println("\n"+cliset);

        //MAP
        Map<String, Cliente> mapa = new TreeMap<String, Cliente>();
        mapa.put("Primeiro", a);
        mapa.put("Segundo", b);
        mapa.put("Terceiro", c);

        System.out.println("\n"+mapa);
        System.out.println(mapa.get("Segundo"));

        Collection<Cliente> clientemap = mapa.values();
        for (Cliente e : clientemap){
            System.out.println(e);
        }

    }
}
