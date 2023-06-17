import java.util.Date;

public class Task1 {

    public class Employee {
        private String name;
        private Date dob;
        private int baseSalary;

        public Employee(String name, Date dob, int baseSalary) {
            this.name = name;
            this.dob = dob;
            this.baseSalary = baseSalary;
        }

        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }

        public int getBaseSalary() {
            return baseSalary;
        }
    }

    public class Salary {
        public int calculateNetSalary(Employee emploee) {
            int tax = (int) (emploee.getBaseSalary() * 0.25);//calculate in otherway
            return emploee.getBaseSalary() - tax;
        }
    }
}
