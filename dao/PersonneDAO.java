package ma.ecole.dao;

import ma.ecole.entities.Personne;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonneDAO extends  BaseDAO<Personne>{
    public PersonneDAO() throws SQLException {

        super();
    }

    @Override
    public void save(Personne obj)  throws SQLException {
        // save Personne
        // requette perpare
        String request = "insert into personne (nom,age , dtype) values(?,? , ?)";
        this.preparedStatement = this.myconnection.prepareStatement(request) ;

    // mapping
        this.preparedStatement.setString(1 ,obj.getNom() );
        this.preparedStatement.setInt(2 ,obj.getAge() );
        this.preparedStatement.setString(3 ,"Personne");

        this.preparedStatement.execute();


    }

    @Override
    public void update(Personne obj)throws SQLException {

    }

    @Override
    public  void delete(Personne obj) throws SQLException{
        // save Personne
        // requette perpare

        String request = "delete from personne where id_personne = ?";

        this.preparedStatement = this.myconnection.prepareStatement(request) ;
// mapping

        this.preparedStatement.setLong(1 ,obj.getId_personne() );


        this.preparedStatement.execute();
    }

    @Override
    public Personne getOne(int id)throws SQLException {

        Personne personne = new Personne();
        String request = "select * from personne where id_personne = ?";

        this.preparedStatement = this.myconnection.prepareStatement(request);

// mapping

        this.preparedStatement.setLong(1, id);


        this.resultSet = this.preparedStatement.executeQuery();


        while (resultSet.next()) { // des ligens dans la bdd


            personne = new Personne(resultSet.getLong(1),
                    resultSet.getString(2),
                    resultSet.getInt(3));

            break;


        }

        return personne ;

    }

    @Override
    public  List<Personne> getAll() throws SQLException{

        List<Personne> mylis = new ArrayList<Personne>();

        String request = "select * from personne";

        this.statement = this.myconnection.createStatement();

         this.resultSet =  this.statement.executeQuery(request);

         // mapping relations objet

            while(resultSet.next()){ // des ligens dans la bdd


                mylis.add(
                        new Personne(resultSet.getLong(1) ,
                                resultSet.getString(2) ,
                                resultSet.getInt(3))) ;

            }


        return mylis;
    }
}
