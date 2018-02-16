public class NumbersAndMath
{
	public static void main(String[] args)
	{
		System.out.println(25.0 * 3.0 % 4.0);
		//print statement on separate line
		System.out.println("I will now count my chickens:");

		//print sum, division takes priority 
		System.out.println("Hens " + (25.0 + 30.0 / 6.0));
		//print solution, multiplication takes priority over modulus 
		System.out.println("Roosters " + (100.0 - (25.0 * 3.0) % 4.0));

		// print statement on separate line
		System.out.println("Now I will count the eggs:");

		//print solution, modulus and division take priority 
		System.out.println(3 + 2 + 1 - 5 + 4.0 % 2.0 - 1.0 / 4.0 + 6);

		//print statement on new line
		System.out.println("Is it true that 3 + 2 < 5 - 7?");

		// print comparison as boolean 
		System.out.println(3 + 2 < 5 - 7);
		
		//print sum
		System.out.println("What is 3 + 2? " + (3 + 2));
		System.out.println("What is 5 - 7? " + (5 - 7));
		
		//print statements
		System.out.println("Oh, that's why it's false.");
		System.out.println("How about some more.");

		// print comparisons as boolean
		System.out.println("Is it greater? " + (5 > -2));
		System.out.println("Is it greater or equal? " + (5 >= -2));
		System.out.println("Is it less or equal? " + (5 <= -2));
	}
}


