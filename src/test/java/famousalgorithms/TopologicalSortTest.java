package famousalgorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopologicalSortTest {

    @Test
    void test() {
        List<Integer> jobs = new ArrayList<>();
        jobs.add(0);
        jobs.add(1);
        jobs.add(2);
        jobs.add(3);
        jobs.add(4);
        jobs.add(5);
        jobs.add(6);
        jobs.add(7);
        jobs.add(8);
        jobs.add(9);
        jobs.add(10);
        jobs.add(11);
        jobs.add(12);

        List<Integer[]> deps = new ArrayList<>();
        deps.add(new Integer[] {1,2});
        deps.add(new Integer[] {1,3});
        deps.add(new Integer[] {1,4});
        deps.add(new Integer[] {1,5});
        deps.add(new Integer[] {1,6});
        deps.add(new Integer[] {1,7});
        deps.add(new Integer[] {2,8});
        deps.add(new Integer[] {3,8});
        deps.add(new Integer[] {4,8});
        deps.add(new Integer[] {5,8});
        deps.add(new Integer[] {6,8});
        deps.add(new Integer[] {7,8});
        deps.add(new Integer[] {2,3});
        deps.add(new Integer[] {2,4});
        deps.add(new Integer[] {5,4});
        deps.add(new Integer[] {7,6});
        deps.add(new Integer[] {6,2});
        deps.add(new Integer[] {6,3});
        deps.add(new Integer[] {6,5});
        deps.add(new Integer[] {5,9});
        deps.add(new Integer[] {9,8});
        deps.add(new Integer[] {8,0});
        deps.add(new Integer[] {4,0});
        deps.add(new Integer[] {5,0});
        deps.add(new Integer[] {9,0});
        deps.add(new Integer[] {2,0});
        deps.add(new Integer[] {3,9});
        deps.add(new Integer[] {3,10});
        deps.add(new Integer[] {10,11});
        deps.add(new Integer[] {11,12});
        deps.add(new Integer[] {2,12});

        var result = TopologicalSort.topologicalSort(jobs, deps);
        System.out.println(result);
    }

}