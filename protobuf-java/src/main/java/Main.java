import com.kishorek.protos.Employee;
import com.kishorek.protos.EmployeeDB;

import java.io.*;

public class Main {

    private static final String FILE_NAME = "employees.data";

    public static void serialize(EmployeeDB emp) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(FILE_NAME);
            emp.writeTo(fos);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserialize() {
        EmployeeDB employeeDB = null;
        try {
            employeeDB = EmployeeDB.newBuilder().mergeFrom(new FileInputStream(FILE_NAME)).build();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(employeeDB);
    }

    public static void printFile() {
        try(BufferedReader fis = new BufferedReader(new FileReader(FILE_NAME))) {
            String output = null;
            while ((output = fis.readLine()) != null) {
                System.out.println(output);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Employee employee = Employee.newBuilder()
                .setEmail("user@email.com")
                .setId(1)
                .setName("John Doe")
                .setInfo(Employee.EmploymentInfo.newBuilder().setDept("Finance").setType(Employee.EmpType.CONTRACT).build()).build();
        EmployeeDB.Builder employeeDBBuilder = EmployeeDB.newBuilder();
        
        employeeDBBuilder.addEmployee(employee);

        serialize(employeeDBBuilder.build());
        printFile();
        deserialize();
    }
}