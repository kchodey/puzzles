package Numbers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyCounter {
	
	public static Map<Integer, Integer> getFrequencyMap(int[] arr) {
		Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (frequencyMap.containsKey(arr[i])) {
				int count = (int) frequencyMap.get(arr[i]);
				frequencyMap.put(arr[i], count+1);
			} else {
				frequencyMap.put(arr[i], 1);
			}
		}
		
		return frequencyMap;
		
	}
    private static void printMap(Map<Integer, Integer> map) {
        
        // Get the iterator for key set of the map
        Iterator<Integer> iterator = map.keySet().iterator();
        
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " ->" + map.get(key));
        }
    }

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 4, 3, 5, 5, 4, 6, 6, 6, 7, 7, 7, 7 };

		Map<Integer, Integer> frequencyMap = getFrequencyMap(arr);

		printMap(frequencyMap);
	}
}
