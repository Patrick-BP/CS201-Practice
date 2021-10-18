package Students;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Student[] cs201Students = enterclass(2);

    printStd(cs201Students);

    }
    public static void printStd(Student [] std){

        for (int i = 0; i < std.length ; i++) {

            System.out.print(std[i].getsId() +","+ std[i].getsName()  + " ,");
        }

    }
    public static Student[] enterclass(int classSize){
        Scanner input = new Scanner(System.in);
        Course cs201 = new Course("111","java",34);
        Student [] cs201Class = new Student[classSize];
        for (int i = 0; i < classSize ; i++) {
            System.out.println("Enter student (" +(i+1) + ") name:");
            String sname = input.next();
            System.out.println("Enter student (" +(i+1) + ") id:");
            String sId = input.next();

            cs201Class[i] = new Student(sId, sname,0.0, cs201 );
        }
        return cs201Class;

    }
}
