import java.util.Scanner;
import java.lang.Math;

public class BMICalc {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Your height in m: ");
        double height = keyboard.nextDouble();
        
        System.out.print("Your weight in kg: ");
        double weight = keyboard.nextDouble();
        
        double BMI = weight / Math.pow(height, 2);
        
        System.out.println("Your BMI is " + BMI);
        
    
    }

}
