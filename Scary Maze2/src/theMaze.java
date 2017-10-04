import java.util.Scanner;

public class theMaze {
Scanner move = new Scanner(System.in);
public static int xLocation;
public static int yLocation;

public static void main(String[] args) {
	startGame();
    Game_Beginning();
    Game_Board();
}
public static void startGame()
{
	class introductionStuff
	{
		
	}
}
public static void Game_Beginning(){
           System.out.println("This is your game maze:");
    System.out.println("____________________");
}
public static void Game_Board(){
    char maze[][] = new char[20][20];
    xLocation = (int )(Math.random() * 20 + 1);
    yLocation =(int )(Math.random()* 20 +1 );
    for (int i = 0; i < maze.length; i++)
    {
        for (int j = 0; j < maze.length; j++)
        {
            double random = Math.random();
            if (random <= .05){
                maze[i][j] = '_';
                
            }
            else if (random > .06 && random <= .29){
                maze[i][j] = '_';
            }
            else{
                maze[i][j] = ' ';
            }
            maze[0][0] = 'R';
            maze[xLocation][yLocation] = 'M';
            System.out.print(maze[i][j]);
            
        }
        System.out.println("|");
        
    }
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter your move (w(up)-s(down)-a(Left)-d(Right)): ");
    String guess =userInput.nextLine();
    if (guess.equals("w"))
    	{
    	xLocation--;
    	}
    else if(guess.equals("s"))
    	{
    	xLocation++;
    	}
    else if(guess.equals("a"))
    	{
    	yLocation--;
    	}
    else if(guess.equals("d"))
    	{
    	yLocation++;
    	}
    else
    	{
    	
    	}
    
}
public static void makeMove(){
	char maze[][] = new char[20][20];
	System.out.print("____________________");
	System.out.println("");
	
}}