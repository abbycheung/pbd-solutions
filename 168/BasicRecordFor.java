import java.util.Scanner;

class Student {
  String name;
  int grade;
  double avg;
}

public class BasicRecordFor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Student[] studentList = new Student[3];
    double sum = 0;
    double num = 0;
    
    for (int i = 0; i < studentList.length; i++) {
      studentList[i] = new Student();
      
      System.out.print("Enter student " + (i+1) + "'s name:");
      studentList[i].name = input.next();
      System.out.print("Enter student " + (i+1) + "'s grade:");
      studentList[i].grade = input.nextInt();
      System.out.print("Enter student " + (i+1) + "'s average:");
      studentList[i].avg = input.nextDouble();
      
    }
    
    System.out.print("The names are: ");
    for (int i = 0; i < studentList.length; i++) {
      System.out.print(studentList[i].name + " ");
      if (i == 2) {
        System.out.println("\n");
      }
    }    
   
    System.out.print("The grades are: ");
    for (int i = 0; i < studentList.length; i++) {
      System.out.print(studentList[i].grade + " ");
      if (i == 2) {
        System.out.println("\n");
      }
    }
   
    for (int i = 0; i < studentList.length; i++) {
      sum += studentList[i].avg;
      num += 1;
    }
    System.out.println("The average for the three students is: " + sum/num);

  }
}
