
public class IterativeSearcher {

	public int doBinarySearch(IntegerArray arrayToSort, int key) {
		int low = 0;
		int high = arrayToSort.length() - 1;
		int result = -1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			int array = arrayToSort.read(mid);
			
			if (array == key) {
				result = mid;
				high = mid - 1;
			}
			else if (array < key) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return result;
	}

}
