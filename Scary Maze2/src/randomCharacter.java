import java.util.ArrayList;
import java.util.Random;

public class randomCharacter
	{
		private Random randomGenerator;
	    private ArrayList<monster> catalogue;
	    public static void Catalogue()
	    { 
	        = new ArrayList<monster>();
	        randomGenerator = new Random();
	    }

	    public static void  anyItem()
	    {
	        int index = randomGenerator.nextInt(catalogue.size());
	        monster item = catalogue.get(index);
	        System.out.println("Hello I'm" +  + "our recommendation to you");
	        return item;
	    }	
	}
