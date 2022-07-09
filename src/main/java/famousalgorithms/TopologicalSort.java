package famousalgorithms;

import linkedlist.ShiftLinkedList;

import java.net.Inet4Address;
import java.util.*;

public class TopologicalSort {

    public static List<Integer> topologicalSort(List<Integer> jobs, List<Integer[]> deps) {
        // Write your code here.
        Map<Integer, Integer> jobsMap = new HashMap<>();
        Map<Integer, List<Integer>> depsGraph = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int job : jobs) {
            jobsMap.put(job, 0);
        }

        for(Integer[] dep : deps) {
            int first = dep[0];
            int second = dep[1];
            int dependencyCount = jobsMap.get(second) + 1;
            jobsMap.put(second, dependencyCount);

            if(!depsGraph.containsKey(second)) {
                depsGraph.put(second, new ArrayList<>());
            }

            List<Integer> dependencies = depsGraph.get(second);
            dependencies.add(first);
            depsGraph.put(second, dependencies);
        }
        Queue<Integer> queue = new LinkedList<>();

        for(Map.Entry<Integer, Integer> entry : jobsMap.entrySet() ) {
            int job = entry.getKey();
            int dependencies = entry.getValue();
            if(dependencies == 0) {
                result.add(job);
            } else {
                queue.add(job);
            }
        }
        int timesAdded = 0;
        while(!queue.isEmpty()) {
            int job = queue.poll();
            List<Integer> dependencies = depsGraph.get(job);
            List<Integer> updatedDependencies = new ArrayList<>();
            int removeCount = 0;
            for(int dependency : dependencies) {
                if(jobsMap.get(dependency) == 0) {
                    //updatedDependencies.add(dependency);
                    int dependencyForJob = jobsMap.get(job);
                    dependencyForJob = dependencyForJob - 1;
                    removeCount++;
                    jobsMap.put(job, dependencyForJob);
                    if(dependencyForJob == 0) {
                        result.add(job);
                        break;
                    }
                } else {
                    updatedDependencies.add(dependency);
                }
            }

            depsGraph.put(job, updatedDependencies);
            if (removeCount != dependencies.size()) {
                queue.add(job);
                timesAdded++;
                if(timesAdded > deps.size()) {
                    return new ArrayList<>();
                }
            }
        }


        return result;
    }

}
