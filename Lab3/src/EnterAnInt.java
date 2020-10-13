import java.util.Scanner;

public class EnterAnInt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String userName = scnr.next();
		
		System.out.println("Enter a number between 1 and 100:");
		int userInput = scnr.nextInt();
		
		if (userInput < 1 || userInput > 100){
			System.out.println("Please enter a number between 1 and 100 " + userName);
			userInput = scnr.nextInt();
		}
		
		
		if (userInput % 2 != 0 && userInput < 60){
			System.out.println(userInput + " is odd " + userName);
		}
		else if (userInput % 2 == 0 && userInput >= 2 && userInput <=25){
			System.out.println(userInput + " is even and less than 25 " + userName);
		}
		else if (userInput % 2 == 0 && userInput >= 26 && userInput <=60){
			System.out.println("That is even " + userName);
		}
		else if (userInput % 2 == 0 && userInput > 60){
			System.out.println(userInput + " is even" + userName);
		}
		else if (userInput % 2 != 0 && userInput > 60){
			System.out.println(userInput + " is odd and over 60 " + userName);
		}
		System.out.println("Continue? (y/n)");
		char toContinue = scnr.next().charAt(0);
			if (toContinue == ('y')) {
				main(null); // if input is Y then call main again.
				
			} else {
				System.out.println("Ending.");
			}
	}
}
