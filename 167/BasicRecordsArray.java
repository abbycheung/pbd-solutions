import java.util.Scanner;

class Student {
  String name;
  int grade;
  double avg;
}

public class BasicRecordsArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    Student[] studentList = new Student[3];
    
    studentList[0] = new Student();
    System.out.print("Enter the first student's name: ");
    studentList[0].name = input.next();
    System.out.print("Enter the first student's grade: ");
    studentList[0].grade = input.nextInt();
    System.out.print("Enter the first student's average: ");
    studentList[0].avg = input.nextDouble();
    
    studentList[1] = new Student();
    System.out.print("Enter the second student's name: ");
    studentList[1].name = input.next();
    System.out.print("Enter the second student's grade: ");
    studentList[1].grade = input.nextInt();
    System.out.print("Enter the second student's average: ");
    studentList[1].avg = input.nextDouble();
    
    studentList[2] = new Student();
    System.out.print("Enter the third student's name: ");
    studentList[2].name = input.next();
    System.out.print("Enter the third student's grade: ");
    studentList[2].grade = input.nextInt();
    System.out.print("Enter the third student's average: ");
    studentList[2].avg = input.nextDouble();
    
    System.out.println("The names are: " + studentList[0].name + " " + studentList[1].name + " " + studentList[2].name); 
    System.out.println("The grades are: " + studentList[0].grade + " " + studentList[1].grade + " " + studentList[2].grade);
    System.out.println("The average for the three students is: " + ((studentList[0].avg + studentList[1].avg + studentList[2].avg)/3));

  }
}
