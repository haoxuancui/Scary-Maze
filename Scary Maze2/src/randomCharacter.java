import java.util.ArrayList;
import java.util.Random;

public class randomCharacter
	{
		private Random randomGenerator;
	    private ArrayList<monster> catalogue;
	public static void  anyItem()
	    {
	        int index = static randomGenerator.nextInt(catalogue.size());
	        monster item = catalogue.get(index);
	        System.out.println("Hello I'm" +  + "our recommendation to you");
	        return item;
	    }	
	}
