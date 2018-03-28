public class Person {

    private String lastName;
    private String firstName;
    private int age;


    /**
     * Constructor for Person
     * 
     * @param firstName
     *          String representing the person's first name.
     * @param lastName
     *          String representing the person's last name.
     * @param age
     *          Integer representing the person's age.
     */
    
    public Person(String firstName, String lastName, int age) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
    }
    

    /**
     * Getter for the person's name.
     * @return
     *          Full name in the format "first last".
     */
    
    public String getName() {
      return firstName + " " + lastName;
    }
    
    
    /**
     * Getter for age.
     * @return
     *          Integer representing the person's age.
     */
     
     public int getAge() {
       return this.age;
     }
  

    /**
     * Setter for name.
     * @param firstName
     *          Person's first name.
     * @param lastName
     *          Person's last name.
     */
    public void setName(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
    
    
    /**
     * Setter for age.
     * @param age
     *          Person's age.
     */
     public void setAge(int age) {
       this.age = age;
     }
   
}