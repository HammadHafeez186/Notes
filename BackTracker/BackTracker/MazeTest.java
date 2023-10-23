package BackTracker;

import java.io.IOException;

public class MazeTest {
    public static void main(String[] args) throws IOException {
        /*Maze maze=new Maze("Maze1.txt");
        //testing if the maze is loading correctly

        maze.print();
      /*
        //testing if rat is out of the maze
        Rat rat=new Rat(maze);
        rat.setLocation(new Location(11,5)); //the exit point
        if(rat.isOut())
        {
            System.out.println("RAT FOUND THE EXIT!!!!");
        }
        else {
            System.out.println("WRONG");
        }*/
        SolveMaze maze1=new SolveMaze("Maze1.txt");

    }
}
