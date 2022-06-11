package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> result = new ArrayList<>();
        solve(array, new ArrayList<>(), 0, result);
        return result;
    }

    private void solve(List<Integer> nums, List<Integer> tempList, int start, List<List<Integer>> result) {
        result.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.size(); i++) {
            tempList.add(nums.get(i));
            solve(nums, tempList, i + 1, result);
            tempList.remove(tempList.size()-1);
        }
    }
}
