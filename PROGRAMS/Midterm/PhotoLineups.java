import java.util.Scanner;
import java.util.ArrayList;

/**
 * Midterm Probloem 1:
 * Write a program that lists all ways people can line up for a photo (all permutations of a list of Strings).
 * The program will read a list of one word names (until -1), and use a recursive method to create and 
 * output all possible orderings of those names, one ordering per line.
 * 
 * @author J.Ho
 *
 */

public class PhotoLineups {

	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		if(nameList.size()==0) {
			// print all permlist
			for (int i = 0; i < permList.size(); ++i) {
				System.out.print(permList.get(i) + " ");
			}
			System.out.println();
			
		} else { //recursive case 
			for (int i = 0; i < nameList.size(); ++i) {
	
				//create the arraylist for the premutations
				ArrayList<String> newPerms = new ArrayList<String>(permList);
		
				//add the items from the namelist to the perms list
				newPerms.add(nameList.get(i));
		
				//create a new names ararylist 
				ArrayList<String> newNames = new ArrayList<String>(nameList);
		
				//remove the name at current index
				newNames.remove(i);
		
				//do the same with the new namelist recursively until basecase is reached
				allPermutations(newPerms, newNames);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		ArrayList<String> nameList = new ArrayList<String>();
		ArrayList<String> permList = new ArrayList<String>();
		String name;

		// Read in a list of names and stop when -1 is read
		System.out.println("Please Enter Name (-1 to finish entering): ");
		name = new String(scnr.next());
		while(!name.equals("-1")) {
			nameList.add(name);
			name = scnr.next();
		}
		
		// call recursive method
		allPermutations(permList, nameList);
		
		scnr.close();
	}
}
