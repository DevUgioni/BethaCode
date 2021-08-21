import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //DIRETOR
        Diretor diretor = new Diretor(1, "Dilnei", "10015010689", 10000.00, 50.5);

        DiretorService service1 = new DiretorService();
        service1.save(diretor);

        diretor.setNome(diretor.getNome() + " - alterado");
        service1.update(diretor);

        DiretorRepository repository1 = new DiretorRepository();
        repository1.findAll();
        repository1.findById(1);

        //FUNCIONARIO
        Funcionario funcionario = new Funcionario(1, "Roberto", "10615268832", 2500.90);

        FuncionarioService service = new FuncionarioService();
        service.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - alterado");
        service.update(funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();
        repository.findAll();
        repository.findById(1);
    }
}