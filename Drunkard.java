import java.util.Random;

public class Drunkard
{
	//set variables
	private int avenue;
	private int street;
	private int userAve;
	private int userSt;
	
	//constructor for a new Drunkard object
	public Drunkard (int userAve, int userSt)
	{
		avenue = userAve;
		street = userSt;
		
		this.userAve = userAve;
		this.userSt = userSt;
	}
	
	//method that generates a random number and based
	//on the number, "moves" drunkard in a particular direction
	//by adding to or subtracting from street and avenue values
	public void step()
	{
		Random r = new Random();
		int randomNum = r.nextInt(4);
		
		if(randomNum == 1)
		{
			//choose to move North
			street++;
		} else if (randomNum == 2){
			//choose to move East
			avenue++;
		} else if (randomNum == 3){
			//choose to move South
			street--;
		} else if (randomNum == 4){
			//choose to move West
			avenue--;
		}
		
	}
	
	//method that moves drunkard steps steps
	//from current location by calling the step()
	//method steps times
	public void fastForward(int steps)
	{
		for(int i = 1; i <= steps; i++)
		{
			step();
		}
	}
	
	//returns the current location (ave, street) of drunkard
	public String getLocation()
	{
		return ("(" + avenue + ", " + street + ")");
	}
	
	//tells the distance (in blocks) drunkard has travelled
	public int howFar()
	{
		int numAves = Math.abs(userAve - avenue);
		int numSts = Math.abs(userSt - street);
		
		int totalBlocks = numAves + numSts;
		
		return totalBlocks;
	}
}
