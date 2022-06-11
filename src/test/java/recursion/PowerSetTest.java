package recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PowerSetTest {

    @Test
    void test() {
       PowerSet p1 = new PowerSet();
       var result = p1.powerset(List.of(1,2,3));
        System.out.println(result);
    }

}