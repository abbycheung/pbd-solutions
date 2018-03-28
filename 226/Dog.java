public class Dog {
  String name;
  String breed;
  String colour;
  int birthYear;
  
  public Dog(String name, String breed, String colour, int birthYear) {
    this.name = name;
    this.breed = breed;
    this.colour = colour;
    this.birthYear = birthYear;
  }
  
  public void sayHello() {
    System.out.println("Woof!");
  }
  
  public int getAge() {
    int humanAge = (2018 - birthYear);
    int dogAge = humanAge * 7;
    
    return dogAge;
  }
}