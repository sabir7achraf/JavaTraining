package ma.ecole.dao;

import ma.ecole.tools.ConnectionBDD;
import ma.ecole.tools.ConnectionFactory;

import java.sql.*;
import java.util.List;

public abstract  class BaseDAO <T> {

    // attributs

   protected  Connection myconnection ;
    protected Statement statement ;
    protected  PreparedStatement preparedStatement ;
    protected  ResultSet resultSet ;

    // params de connection



// constrecteur par defaut
    public BaseDAO() throws SQLException {

        this.myconnection = ConnectionFactory.getConnection("POSTGRES");
    }



    public abstract  void save( T obj ) throws SQLException;
    public abstract  void update( T obj ) throws SQLException;
    public abstract  void delete( T obj ) throws SQLException;
    public abstract  T getOne( int id ) throws SQLException;
    public abstract List<T> getAll( ) throws SQLException;

}
