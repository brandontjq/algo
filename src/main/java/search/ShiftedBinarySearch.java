package search;

public class ShiftedBinarySearch {

    public int shiftedBinarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(array[mid] == target) {
                return mid;
            }

            int oneBeforeMid = mid - 1 == 0 ? 0 : mid - 1;
            int oneAfterMid = mid + 1 == array.length ? array.length : mid + 1;


            if(array[low] <= array[oneBeforeMid]) {
                if(target > array[oneBeforeMid] || target < array[low]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if(target < array[oneAfterMid] || target > array[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
