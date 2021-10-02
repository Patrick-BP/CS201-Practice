package chapter4;

public class EmployeeApplication {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Patrick","Bihizi",80000,
                new Address("9959 Adleta Blvd","Dallas","Texas","75243"),
                new Address("1000 N 4th Street","Fairfield","IA","52557"));

        Employee emp2 = new Employee("Chadia","Kayitesi",100000,
                new Address("2389 Fairoaks Dr","Arlington","Texas","754545"),
                new Address("1000 N 4th Street","Fairfield","IA","52557"));


        System.out.println(emp1.getWorkAddress().getStreet());
        System.out.println(emp1.getHomeAddress().getStreet());
    }
}
