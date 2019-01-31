import java.util.HashMap;

public class TwoSum{
	public int[] twoSum(int[] list, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int otr;
		for (int i = 0; i < list.length; i++) {
			otr = target - list[i];
			if (map.containsKey(otr)) {
				return new int[] {map.get(otr), i};
			}
			map.put(list[i], i);
		}
		return new int[] {0, 0};
	}
}
