import java.util.*;

/**
 * class: UniqueMap class
 * @author J.Ho
 * @date 5/3/2020
 */
public class UniqueMap {
	
	/**
	 * check if each value in the map is unique
	 * @param map
	 * @return 'true' when no duplicate values, 'false' when duplicate values
	 */
	public static boolean isUnique(Map<String,String> map) {
		int count = 0;
		boolean flag = true;
		
		// loop each value in the map
		for(String val : map.values()) {
			
			// get the number of the value contained in the map
			count = Collections.frequency(map.values(), val);
			
			// turn the flag to 'false' and break if the value is not unique
			if(count > 1) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
