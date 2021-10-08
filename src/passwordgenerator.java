import java.util.Random;

public class passwordgenerator {
    public static void main(String[] args) {


        passwordGenerator();

    }
    public static void passwordGenerator(){
        Random rand = new Random();
        StringBuffer pass = new StringBuffer();
        pass.append(rand.nextInt(10));
        pass.append(rand.nextInt()+'A');
        System.out.println(pass.toString());
    }
}
