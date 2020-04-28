import java.util.*;

/**
 * class: ArrayListManager class
 * @author J.Ho
 * Date: 04/28/2020
 */
public class ArrayListManager {

	/**
	 * removes all of the strings of even length from the list
	 * @param list
	 * @return an ArrayList<String>
	 */
	public ArrayList<String> removeEvenLength(ArrayList<String> list) {

		System.out.println("------------------");
		System.out.println("Input: " + list);
		System.out.println("------------------");

		Iterator<String> itr=list.iterator();
  		while(itr.hasNext()){  

			// if string is even length, remove from the list
			if(itr.next().toString().length() % 2 == 0){
				itr.remove();
			}
		}		 

		System.out.println("------------------");
		System.out.println("Output: " + list);
		System.out.println("------------------");

		return list;
	}
	
	/**
	 * replaces every string with two of that same string in the list
	 * ex. input:["how", "are", "you?"], output:["how", "how", "are","are", "you?", "you?"]
	 * @param list
	 * @return an ArrayList<String>
	 */
	public ArrayList<String> doubleList(ArrayList<String> list){

		System.out.println("------------------");
		System.out.println("Input: " + list);
		System.out.println("------------------");

		ArrayList<String> temp = new ArrayList<String>(list);
		for(String str : temp){

			// make double of each string in the list 
			list.add(list.indexOf(str) + 1, str);
		}

		System.out.println("------------------");
		System.out.println("Output: " + list);
		System.out.println("------------------");

		return list;
	}

}
