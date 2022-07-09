package tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReconstructBstTest {
    @Test
    void test() {
        ReconstructBst reconstructBst = new ReconstructBst();
        var result = reconstructBst.reconstructBst(List.of(10,4,2,1,5,17,19,18));
        System.out.println(result);
    }

}