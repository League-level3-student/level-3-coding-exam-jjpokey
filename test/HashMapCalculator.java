import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matchingNumbers = 0;
			for(String s : hashmap1.keySet()) {
				if(hashmap2.containsKey(s) && hashmap1.containsKey(s)) {
						if(hashmap1.get(s).equals(hashmap2.get(s))) {
							matchingNumbers++;	
				}					
				}
			}

	
		return matchingNumbers;
	}

}
