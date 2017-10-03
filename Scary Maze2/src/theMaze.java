import java.util.Scanner;

public class theMaze {
Scanner move = new Scanner(System.in);

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
    for (int i = 0; i < maze.length; i++){
        for (int j = 0; j < maze.length; j++){
            double random = Math.random();
            if (random <= .05){
                maze[i][j] = '_';
            }
            else if (random > .06 && random <= .29){
                maze[i][j] = '-';
            }
            else{
                maze[i][j] = ' ';
            }
            maze[0][0] = 'R';
            maze[9][9] = 'M';
            System.out.print(maze[i][j]);
        }
        System.out.println("|");
    }
}
public static void makeMove(){
	System.out.print("____________________");
	System.out.println("");
	Scanner userInput = new Scanner(System.in);
    System.out.print("Enter your move (Up-Down-Left-Right): ");

}
}