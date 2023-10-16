import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Josephus {
 
    public static ArrayList<Integer> solve(int m, int n) 
    {
        ArrayList<Integer> players = new ArrayList<Integer>();       
        LinkedList<Integer> circle = new LinkedList<Integer>();

        int i;
        int player;
        int lastOne;
        
        for (i = 1; n >= i; i++) //loop for circle to add players
            circle.add(i);
            i++;
            
        while (circle.size() != 0) // loop for cirlce to remove players according to size
        {
            for (i = 0; m > i; i++) //loop for hwoever many times M runs
            {
            	player = circle.remove();
            	circle.add(player);
            }

            lastOne = circle.remove(); //mark the last player after M passes            
            players.add(lastOne); // declare them the winner
        }

        return players;
    }// end method


    //method to test output
	public static void main(String[] args)
	{
	 	int a;
	 	int b;
	 	int winner;

	 	System.out.println("Enter integers m and n [with space inbetween]"); 
     	 	
     	Scanner input = new Scanner(System.in);
     		a =  input.nextInt();
     		b =  input.nextInt();

     	ArrayList<Integer> game = Josephus.solve(a,b);
     	
     	winner = game.get(game.size() -1 );

  		System.out.println(game + "\nWINNER IS " + winner);     	 	
     	 	
	}// end method

} //end class



