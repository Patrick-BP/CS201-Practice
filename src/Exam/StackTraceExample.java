package Exam;

public class StackTraceExample {
    public static void main(String[] args) {
        String text ="Issac";
        int ans = methodA(text);
        System.out.println("from main method");
        System.out.println(ans);
        System.out.println("hello");

    }
    public static int methodA(String word){
        String result = methodB(word);
        System.out.println("from methodA");
        return result.length();

    }
    public static String methodB(String word){
        String newString = word + word;
        System.out.println("from methodB");
        return newString;
    }
}
