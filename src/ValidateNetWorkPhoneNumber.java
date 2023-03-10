import justExercise.ValidateNumberExeption;
import justExercise.ValidateNetWorkPhoneNumberz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateNetWorkPhoneNumber {
    ValidateNetWorkPhoneNumberz validate;
    @BeforeEach
    @Test
    void setUp(){
        validate = new ValidateNetWorkPhoneNumberz();
       }
    @Test
    void testThatWeCanValidateMtnNumber(){
    assertEquals(true,validate.validateForMtN("0903"));
    }
    @Test
    void testThatWeCanValidateAirtelNumber(){
    assertEquals(true, validate.validForAirtel("0708"));
    }

    @Test
    void testThatWeCanValidateForGloNumber(){
        assertEquals(true, validate.validateForGLo("0805"));
    }
    @Test
    void testThatWeCanValidateForEtisalat (){
assertEquals(true, validate.validateForEtisalat("0909"));
    }
    @Test
    void testThatWeCanValidateForVisaFone(){
        assertEquals(true,validate.validateForVisaFone("07026"));
    }
    @Test
    void testThatWeCanCheckIfAnInPutContainAlphabet() throws ValidateNumberExeption {
        assertEquals("12345", validate.ifContainAlphabet("12345"));
    }
    @
    Test
    void  testThatWeCanCheckForLenghtOfOurMobileNumber() throws ValidateNumberExeption {
        assertEquals("09099332737", validate.checkForPhoneNumberLength("09099332737"));
    }
    @Test
    void testThatWeCanGetTheFirstfourDigitsOfAMobileNumber(){
        assertEquals("0909", validate.holdFirstFourDigit("09099332737"));
    }
}
