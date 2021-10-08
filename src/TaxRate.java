import java.util.Scanner;

public class TaxRate {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your satus");
        String status = key.next();
        System.out.println("Enter your salary");
        double salary = key.nextInt();

        calTaxRate(status, salary);
    }
    public static void calTaxRate(String status, double salary){
        final double HIGH_TAX_RATE = 0.18;
        final double LOW_TAX_RATE = 0.1;
        if(status.equals("single") ){
            if(salary<=40000)System.out.println(LOW_TAX_RATE);
            else System.out.println(HIGH_TAX_RATE);
        }
        else if(status.equals("married") ){
            if(salary<=60000) System.out.println(LOW_TAX_RATE);
            else System.out.println(HIGH_TAX_RATE);

        }


    }
}
