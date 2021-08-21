package service;
import java.sql.SQLException;
import model.Diretor;
import model.Funcionario;

public interface IService<E> {

    public E save(E entidade) throws SQLException, ClassNotFoundException;

    public E update(E entidade) throws SQLException, ClassNotFoundException;

    public E delete(E entidade) throws SQLException, ClassNotFoundException;

}
