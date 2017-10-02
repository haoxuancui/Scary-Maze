import java.util.Scanner;

public class introductionStuff
	{
		public static void main(String[] args)
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hey Morty its rick you fell asleep and let some parasites come to earth you were in the maze I trapped them in would you like to get out and live?");
		String guess =userInput.nextLine();
		if(guess.equals("yes"))
			{
			System.out.println("Okay Morty I believe in you please do not destroy the Earth. I will come in and help if I can.");
			System.out.println("Remember Morty bad memories.");
			}
		else
			{
			System.out.println("Sorry Morty looks like I cannot help get you out of this one.");
			}
		}
	}
