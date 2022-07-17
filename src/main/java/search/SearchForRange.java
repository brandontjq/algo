package search;

public class SearchForRange {

    private static int first = -1;
    private static boolean foundFirst = false;
    private static int second = -1;
    private static boolean foundSecond = false;

    public static int[] searchForRange(int[] array, int target) {
        // Write your code here.

        binarySearch(array, target, 0, array.length -1);

        if(foundFirst && !foundSecond) {
            return new int[] {first, first};
        } else if (!foundFirst && foundSecond) {
            return new int[] {second, second};
        }
        return new int[] {first, second};
    }

    private static void binarySearch(int[] array, int target, int low, int high) {

        while(low <= high || (foundFirst && foundSecond)) {
            int mid = (low + high) / 2;

            if(array[mid] == target) {
                if(mid - 1 >=0 && array[mid-1] == target && !foundFirst) {
                    binarySearch(array, target, low, mid - 1);
                } else if (mid - 1 < 0 || array[mid-1] != target && !foundFirst) {
                    first = mid;
                    foundFirst = true;
                    return;
                }
                if(mid + 1 < array.length && array[mid + 1] == target && !foundSecond) {
                    binarySearch(array, target, mid + 1, high);
                } else if(mid + 1 == array.length || array[mid + 1] != target && !foundSecond) {
                    second = mid;
                    foundSecond = true;
                    return;
                }
                if (foundFirst && foundSecond) {
                    return;
                }

            } else if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            }
        }
    }
}
