package ma.ecole.dao;

import java.sql.SQLException;
import java.util.List;

public class ModuleDAO extends BaseDAO<Module>{
    public ModuleDAO() throws SQLException {
        super();
    }

    @Override
    public void save(Module obj) {

    }

    @Override
    public  void update(Module obj) throws SQLException {

    }

    @Override
    public void delete(Module obj) throws SQLException {

    }

    @Override
    public Module getOne(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Module> getAll() throws SQLException {
        return List.of();
    }
}
