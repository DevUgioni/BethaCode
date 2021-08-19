package exemplo_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClienteStreamMain {
    public static void main (String[] args){
        List<Cliente> lista = new ArrayList<Cliente>();

        Cliente a = new Cliente(1,"Roberto","1234567890","23516042");
        Cliente b = new Cliente(2,"Dilnei","1234567892","23516041");
        Cliente c = new Cliente(3,"Davi","1234567893","235160423");
        Cliente d = new Cliente(4,"Claudine","1234567895","23516049");
        Cliente e = new Cliente(5,"Roberson","1234567894","23516044");
        Cliente f = new Cliente(6,"Robertinho","1234567897","23516040");

        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        lista.add(e);
        lista.add(f);

        List<Cliente> filtro = lista.stream().filter(p -> p.getNome().startsWith("Robe")).collect(Collectors.toList());
        System.out.println(filtro);

        List<String> listamap = lista.stream().map(p -> p.getCpf()).collect(Collectors.toList());
        System.out.println(listamap);

        lista.stream().forEach(p -> {
                System.out.println(p.getNome());
                System.out.println(p.getCpf());
        });
    }
}
