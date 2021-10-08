import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        emailCreator();
    }
   public static void emailCreator(){
        Scanner key = new Scanner(System.in);
       System.out.println("Enter your first name and last name");
       String input = key.nextLine();
       char fName = input.charAt(0);
       String lName = "";

     for(int i=0; i< input.length();i++){
            if(input.charAt(i) == ' '){
                lName = input.substring(i+1 , input.length()) ;

            }
       }
       System.out.println( fName+lName + "@miu.edu");


   }
}
