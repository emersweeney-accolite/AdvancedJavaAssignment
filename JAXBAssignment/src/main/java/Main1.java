import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Main1{
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        Employee employee1, employee2 = new Employee(1, "Charlie", 29000);
        JAXBContext context = JAXBContext.newInstance(Employee.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(employee2, new FileOutputStream("employee.xml"));

        File file = new File("employee.xml");
        context = JAXBContext.newInstance(Employee.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        FileReader fr = new FileReader(file);
        Scanner s = new Scanner(fr);
        while (s.hasNextLine()) System.out.println(s.nextLine());

        employee1 = (Employee)unmarshaller.unmarshal(new FileReader(file));

        System.out.println("Employee 2: \nID="+employee2.getId()+
                "\nName="+employee2.getName()+"\nSalary="+employee2.getSalary());
        System.out.println("Employee 1: \nID="+employee1.getId()+
                "\nName="+employee1.getName()+"\nSalary="+employee1.getSalary());

    }
}