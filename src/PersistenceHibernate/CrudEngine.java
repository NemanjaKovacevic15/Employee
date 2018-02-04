package PersistenceHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Nemanja
 */
public class CrudEngine {
    
    Session s = HibernateUtil.createSessionFactory().openSession();
    Transaction t = null;
    
    void insertNew(String name, String address, int age, int wage){
        Employee e = new Employee(name, address, age, wage);
        try {
            t = s.beginTransaction();
            s.persist(e);
            t.commit();}
        catch (HibernateException ex) {
            if(t != null){
                t.rollback();}
            System.out.println(ex);}
        finally {
            HibernateUtil.close();}
    }
    
    void Update(int ID, String name, String address, int age, int wage) {
        try {
            t = s.beginTransaction();
            Employee e = (Employee)s.load(Employee.class, ID);
            e.setName(name);
            e.setAddress(address);
            e.setAge(age);
            e.setWage(wage);
            s.update(e);
            t.commit();} 
        catch (HibernateException ex) {
            if(t != null){
                t.rollback();}
            System.out.println(ex + " update F3 ne radi");}
        finally {
            HibernateUtil.close();}
    }
    
    void Delete(int IDfromDB) {
        try {
            t = s.beginTransaction();
            Employee e = (Employee)s.load(Employee.class, IDfromDB);
            s.delete(e);
            t.commit();} 
        catch (HibernateException ex) {
            if(t != null){
                t.rollback();}
            System.out.println(ex + "   F4 ne radi");}
        finally {
            HibernateUtil.close();}
    } 
    
}
