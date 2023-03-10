package Handling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncrytingAndDecryptingTest {
EncrytingAndDecrypting encrytingAndDecrypting;
    @org.junit.jupiter.api.BeforeEach
    @Test
    void setUp() {
        encrytingAndDecrypting = new EncrytingAndDecrypting();
   }
//    @Test
//  void   testThatNumberCanReduceByOne(){
//        assertEquals(1, encrytingAndDecrypting.encrypting(1234));
//    }
//    @Test
//    void testThatWeNowHaveTwoNumber(){
//        assertEquals(" 1, 2", encrytingAndDecrypting.encrypting(1234));
//    }
//    @Test
//    void testThatWeNowHaveThreeNumbers(){
//        assertEquals(" 1, 2,  3", encrytingAndDecrypting.encrypting(1234));
//    }
//    @Test
//    void testThatWeHaveTheFourNumber(){
//        assertEquals(" 1, 2,  3,  4", encrytingAndDecrypting.encrypting(1234));
//    }
//    @Test
//    void  testThatWeCanAddSevenToOurNumber(){
//        assertEquals(" 8, 9, 10, 11", encrytingAndDecrypting.encrypting(1234));
//    }
//
    @Test
    void testThatWeCanAddSevenToTheNumber(){
        assertEquals(" 8, 9, 10, 11", encrytingAndDecrypting.encrypting(1234));
    }

    @Test
    void testThatWeCanSwapSecondNumberWithTheFourthNumber(){
        assertEquals("", encrytingAndDecrypting.encrypting(1234));
    }

}