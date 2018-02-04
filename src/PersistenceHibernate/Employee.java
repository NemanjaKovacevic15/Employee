package PersistenceHibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Nemanja
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int ID;
    @Column(name = "name")
    private String Name;
    @Column(name = "address")
    private String Address;
    @Column(name = "age")
    private int Age;
    @Column(name = "wage")
    private int Wage;
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    public int getWage() {
        return Wage;
    }

    public void setWage(int Wage) {
        this.Wage = Wage;
    }
    
   public Employee(){
       
    }
    public Employee(String name, String Address, int age, int Wage){
        this.Name = name;
        this.Address = Address;
        this.Age = age;
        this.Wage = Wage;
    }
    
     public Employee(int id,String name, String Address, int age, int Wage){
        this.ID = id; 
        this.Name = name;
        this.Address = Address;
        this.Age = age;
        this.Wage = Wage;
    }
    
    @Override
    public String toString(){
        return "id:" + this.ID +"name:"+ this.Name +"address:"+ this.Address +"age:"+ this.Age + "wage:" + this.Wage;
        
    }
    
    
}

