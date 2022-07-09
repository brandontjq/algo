package graph;

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(
            AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        // Write your code here.

        int heightOfDescendantOne = getHeight(topAncestor, descendantOne);
        int heightOfDescendantTwo = getHeight(topAncestor, descendantTwo);

        if(heightOfDescendantOne == 0) return descendantOne;
        if(heightOfDescendantTwo == 0) return descendantTwo;

        int toMoveUpwards = heightOfDescendantOne - heightOfDescendantTwo;
        if(toMoveUpwards > 0) {
            descendantOne = moveUpwards(descendantOne, toMoveUpwards);
        } else if (toMoveUpwards < 0) {
            descendantTwo = moveUpwards(descendantTwo, Math.abs(toMoveUpwards));
        }

        while(descendantOne != descendantTwo) {
            descendantOne = descendantOne.ancestor;
            descendantTwo = descendantTwo.ancestor;
        }


        return descendantOne; // Replace this line
    }

    private static AncestralTree moveUpwards(AncestralTree descendant, int toMoveUpwards) {
        for(int i = 1; i <= toMoveUpwards; i++) {
            descendant = descendant.ancestor;
        }
        return descendant;
    }

    private static int getHeight(AncestralTree topAncestor , AncestralTree descendant) {
        int height = 0;

        while(descendant != topAncestor) {
            descendant = descendant.ancestor;
            height++;
        }

        return height;
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }

}
