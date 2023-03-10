import main.java.CrudExecisr.HugeInterger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HugeIntergerTest {
HugeInterger hugeInterger;

    @BeforeEach
    @Test
    void setUp() {
        hugeInterger = new HugeInterger();
    }
    @Test
    void testThatWeCanConverStringToInterger(){
//    int num = hugeInterger.converToInterger("2345");
        assertEquals(2345,hugeInterger.converToInterger("2345"));
    }
    @Test
    void testThatWeCanreturnAtoStringOfArray(){
        int [] number = {1,2,3,4};
        assertEquals("1,2,3,4", hugeInterger.myToString(number));
    }
}