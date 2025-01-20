//Userinput .java`

import java.util.*;

class UserInput{
	
	int[] userInput(){
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[2];
		
		System.out.println("enter first number: ");
		numbers[0] = scan.nextInt();
		
		System.out.println("enter second number: ");
		numbers[1] = scan.nextInt();
		
		return numbers;
	}
}