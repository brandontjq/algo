package graph;

import java.util.HashSet;
import java.util.Set;

public class SingleCycleCheck {

    public static boolean hasSingleCycle(int[] array) {
        // Write your code here.
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        int currentIndex = 0;

        while(count <= array.length) {
            if(count == array.length) return true;
            int currentValue = array[currentIndex];

            currentIndex += (currentValue % array.length);

            if(currentIndex < 0) {
                currentIndex = currentIndex + array.length;
            } else if (currentIndex >= array.length) {
                currentIndex = currentIndex - array.length;
            }

            boolean added = visited.add(currentIndex);
            if (!added) return false;
            count++;
        }

        return false;
    }
}
