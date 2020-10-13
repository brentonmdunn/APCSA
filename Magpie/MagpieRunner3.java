import java.util.Scanner;

/**
 * names: Brenton Dunn/Isaias Tamayo
 * IDs: 218005/218055
 * date of completion: 10-12-2020
 * ----------------------------------------------------------
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args){
		Magpie3 maggie = new Magpie3();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye")){
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
