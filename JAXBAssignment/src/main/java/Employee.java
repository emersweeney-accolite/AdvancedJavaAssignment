import javax.xml.bind.annotation.*;

@XmlRootElement(name="Employee")
public class Employee {
    private int id;
    private String name;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @XmlElement(name="id")
    public int getId() {return id;}

    @XmlElement(name="name")
    public String getName() {return name;}

    @XmlElement(name="salary")
    public int getSalary() {return salary;}

}