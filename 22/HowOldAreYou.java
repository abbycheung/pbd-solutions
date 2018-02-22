import java.util.Scanner;

public class HowOldAreYou {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? ");
        String name = keyboard.nextLine();
        
        System.out.print("Ok, " + name + ", how old are you? ");
        int age = keyboard.nextInt();
        
        if (age < 16) {
            System.out.println("You can't drive, " + name);
        } 
        
        if (age < 18) {
            System.out.println("You can't vote, " + name);
        }
        
        if (age < 25) {
            System.out.println("You can't rent a car, " + name);
        } else {
            System.out.println("You can do anything that's legal.");
        }
    }
}
