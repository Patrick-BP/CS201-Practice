import java.util.Scanner;

public class BaggageCost {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your baggage weight" );
        double baggageWeight = key.nextInt();

     double totalCost= 0;
     final double limitWeight = 23;
     final double overWeight = 28;
     final double fine = 10;

     if(baggageWeight <= limitWeight){
         System.out.println("you good to go");

     }
     else
     {
         if(baggageWeight>limitWeight && baggageWeight<=overWeight){
             totalCost =  fine;
             System.out.println(totalCost + " $");
         }
         else{
             totalCost = ((baggageWeight-overWeight)* fine)+10;
             System.out.println(totalCost+ " $");
         }
     }
    }
}
