import java.util.Scanner;

public class theMaze {
Scanner move = new Scanner(System.in);
public static int xLocation;
public static int yLocation;

public static void main(String[] args) {
    Game_Beginning();
    Game_Board();
    makeMove();
}
public static void Game_Beginning(){
           System.out.println("This is your game board:");
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
    for (int i = 0; i < maze.length; i++)
    	{
    	if(guess.equals("w"))
    		{
    		xLocation--;
    	    for  (i = 0; i < maze.length; i++)
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
    	        }
    		}
    	else if(guess.equals("s"))
    		{
    		xLocation++;
    	    for (i = 0; i < maze.length; i++)
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
    		}
    		}
    	else if(guess.equals("a"))
    		{
    		yLocation--;
    	    for (i = 0; i < maze.length; i++)
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
    		}
    		}
    	else if(guess.equals("d"))
    		{
    		yLocation++;
    	    for (i = 0; i < maze.length; i++)
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
    		}
    	}
    	}
    
}
public static void makeMove(){
	char maze[][] = new char[20][20];
	System.out.print("____________________");
	System.out.println("");
	
}
}