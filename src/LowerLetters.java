import java.util.*;
public class LowerLetters {
    public static void main(String[] agrs){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = key.next();
        int count=0;
        for(int i=0; i< input.length(); i++){

           if(Character.isLowerCase(input.charAt(i))) count++;
        }
        System.out.println(count);

    }
}
