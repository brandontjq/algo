package tree;

import java.util.*;

public class NodesDistanceK {

    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public ArrayList<Integer> findNodesDistanceK(BinaryTree tree, int target, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        buildGraph(tree, null, graph);
        Set<Integer> visited = new HashSet<>();
        int counter = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(graph.get(target));

        while(counter < k) {
            int queueSize = queue.size();
            for(int i = 0; i < queueSize; i++) {
                int polled = queue.poll();
                if(!visited.contains(polled)) {
                    visited.add(polled);
                    List<Integer> connectedNodes = graph.get(polled);
                    for(int connectedNode : connectedNodes) {
                        if(connectedNode != target) {
                            if(!visited.contains(connectedNode)) {
                                queue.add(connectedNode);
                            }
                        }
                    }
                }

            }
            counter++;
        }
        result.addAll(queue);
        return result;

    }

    private void buildGraph (BinaryTree node, BinaryTree parent, Map<Integer, List<Integer>> graph) {
        List<Integer> connectedNodes = new ArrayList<>();
        if(node == null & node == null) {
            return;
        }

        buildGraph(node.left, node, graph);
        buildGraph(node.right, node, graph);

        if(parent != null) {
            connectedNodes.add(parent.value);
        }

        if(node.left != null) {
            connectedNodes.add(node.left.value);
        }

        if(node.right != null) {
            connectedNodes.add(node.right.value);
        }

        graph.put(node.value, connectedNodes);

    }
}
