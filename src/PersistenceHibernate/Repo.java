package PersistenceHibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nemanja
 */
public class Repo {
    public static DefaultTableModel dtm = new DefaultTableModel();
    private static Connection conn;
    
    public static Connection getConnection() throws SQLException {
        if(conn==null){
            conn = DriverManager.getConnection("jdbc:mysql://localhost/","root","crvenazvezda");
            DBengine();
        }
        return conn;
    }
   
    public static void DBengine() throws SQLException{
    try {
    PreparedStatement stCreateDB = conn.prepareStatement("create database employeeDB;");
    stCreateDB.execute();
    } catch(SQLException ex) {System.out.println("error in creating DB");}
    PreparedStatement use = conn.prepareStatement("use employeeDB");
    use.execute();
    try {
    PreparedStatement stCTable = conn.prepareStatement("create table employee (id int primary key auto_increment, name varchar(256), address varchar(256), age int, wage int);");
    stCTable.execute();
    } catch(SQLException ex) {System.out.println("error in creating table");}
    }
}
