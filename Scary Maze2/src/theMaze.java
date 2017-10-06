import java.util.Scanner;

public class theMaze 
{
Scanner move = new Scanner(System.in);
public static int xLocation;
public static int yLocation;
static char maze[][] = new char[20][20];
public static void main(String[] args) 
	{
	startGame();
    Game_Beginning();
    Game_Board();
    makemove();
	}

private static void startGame()
	{
	introductionStuff.getStarted();
	}
private static void Game_Beginning()
	{
           System.out.println("This is your game maze:");
    System.out.println("____________________");
	}
private static void Game_Board()
{
    for (int i = 0; i < maze.length; i++)
    {
        for (int j = 0; j < maze.length; j++)
        {
            double random = Math.random();
            if (random <= .05)
            	{
                maze[i][j] = '_';
                
            	}
            else if (random > .06 && random <= .29)
            	{
                maze[i][j] = '_';
            	}
            else
            	{
                maze[i][j] = ' ';
            	}
            maze[0][0] = 'R';
            maze[xLocation][yLocation] = 'M';
            System.out.print(maze[i][j]);
            
        }
        System.out.println("|");
        
        
    }
    
}

private static void makemove()
	{
		int rolling = 0;
		xLocation = (int )(Math.random() * 20 + 1);
	    yLocation =(int )(Math.random()* 20 +1 );
	    maze[0][0] = 'R';
        maze[xLocation][yLocation] = 'M';
	    while(rolling==0)
	    	{
	    		 
	    	        Scanner userInput = new Scanner(System.in);
	    	        System.out.print("Enter your move (w(up)-s(down)-a(Left)-d(Right)): ");
	    	        String userMoves =userInput.nextLine();

	    			switch(userMoves)
	    			{
	    			case "w":
	    				{
	    				xLocation--;
	    				 maze[xLocation][yLocation] = 'm';
	    				 Game_Board();
	    				 break;
	    				}
	    			case "s":
	    					{
	    					xLocation++;
	    					 maze[xLocation][yLocation] = ' ';
	    					 Game_Board();
	    					 break;
	    					}
	    			case "a":
	    					{
	    					yLocation--;
	    					 maze[xLocation][yLocation] = ' ';
	    					 Game_Board();
	    					 break;
	    					}
	    			case "d":
	    				{
	    					yLocation++;
	    					 maze[xLocation][yLocation] = ' ';
	    					 Game_Board();
	    					 break;
	    				}
	    			}
	    			if(xLocation==0 && yLocation==0)
	    				{
	    					rolling=1;
	    					System.out.println("You just find rick!!!");
	    					break;
	    				}
	    			
	    		
	    	}
	   

	}

		
	}
    
  

