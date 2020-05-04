import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

/**
 * class: jtestisunique class
 * @author J.Ho
 * @date 5/3/2020
 */
class jtestisunique {

	@Test
	void testIsUnique1() {
		//--------------------------------
		// expect to get 'true' as return
		//--------------------------------
		Map<String, String> map = new HashMap<>();
		map.put("Marty", "Stepp");
		map.put("Stuart", "Reges");
		map.put("Jessica", "Miller");
		map.put("Amanda", "Camp");
		map.put("Hal", "Perkins");
		
		assertEquals(true, UniqueMap.isUnique(map));
		
	}
	
	@Test
	void testIsUnique2() {
		//--------------------------------
		// expect to get 'false' as return
		//--------------------------------
		Map<String, String> map = new HashMap<>();
		map.put("Kendrick", "Perkins");
		map.put("Stuart", "Reges");
		map.put("Jessica", "Miller");
		map.put("Bruce", "Reges");
		map.put("Hal", "Perkins");
		
		assertEquals(false, UniqueMap.isUnique(map));
		
	}
}
