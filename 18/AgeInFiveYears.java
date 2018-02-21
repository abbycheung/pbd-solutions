import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Hello. What is your name? ");
        String name = keyboard.next();
        
        System.out.print("Hi, " + name + "! How old are you? ");
        int age = keyboard.nextInt();
        
        int fiveYears = age + 5;
        
        int pastYears = age - 5;
        
        System.out.println("Did you know that in five years you will be " + fiveYears + "!");
        System.out.println("And five years ago you were " + pastYears + "! Imagine that!");
       
    }
}
        
