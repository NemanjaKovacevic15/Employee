package PersistenceHibernate;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Nemanja
 */
public class CrudSecondEngine {
    Session s = HibernateUtil.createSessionFactory().openSession();
    Transaction t = null;
    List<Employee> Elist = null;
    
     void ListAll() {
            String getAll = "from Employee";
            Query q = s.createQuery(getAll);
        try {
            t = s.beginTransaction();
            Elist = q.list();
            t.commit();} 
        catch (HibernateException ex) {
            if(t != null){
                t.rollback();}
            System.out.println(ex + "  F1 ne radi");}
        finally {
            HibernateUtil.close();}         
    }
     
    void ListSpecified(String criteria) {
            String getSome = "from Employee where name like '%"+criteria+"%' or address like '%"+criteria+"%'";
            Query q = s.createQuery(getSome);
        try {
            t = s.beginTransaction();
            Elist = q.list();
            t.commit();} 
        catch (HibernateException ex) {
            if(t != null){
                t.rollback();}
            System.out.println(ex + "  F2 ne radi");}
        finally {
            HibernateUtil.close();}
       // for (Employee Elist1 : Elist) {
        //    System.out.println(Elist1);
       // }
    } 
}
