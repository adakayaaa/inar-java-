package week_16.assignments.test;

import org.junit.jupiter.api.Test;
import week_16.assignments.main.LoginValidator;

import static org.junit.jupiter.api.Assertions.*;

class LoginValidatorTest {

    //Test For Equivalence Partitioning
    LoginValidator loginValidator = new LoginValidator();
    @Test
    void validateUsernameValidUser() {
        String input = "valid_Username1@gmail.com";
        assertTrue(loginValidator.validateUsername(input), "TC_01 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }

    @Test
    void validateUsernameEmailWithoutSymbol() {
        String input = "validUsername1gmail.com";
        assertFalse(loginValidator.validateUsername(input), "TC_02 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }
    @Test
    void validateUsernameEmailWithoutDomain() {
        String input = "valid_Username@";
        assertFalse(loginValidator.validateUsername(input), "TC_03 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }
    @Test
    void validateUsernameEmailWithInvalidCharacters() {
        String input = "valid_ @gmail.com";
        assertFalse(loginValidator.validateUsername(input), "TC_04 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }
    @Test
    void validateUsernameEmptyEmailString() {
        String input = " ";
        assertFalse(loginValidator.validateUsername(input), "TC_05 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }
    @Test
    void validateUsernameNullEmailAddress() {
        String input = null;
        assertFalse(loginValidator.validateUsername(input), "TC_06 Test Username's LoginValidator ClassValid " +
                "\n Rule: Username is in the format of an email address."+
                "\n Test Data "+  input);
    }

    @Test
    void validatePasswordValidUser() {
        String input = "Password$01";
        assertTrue(loginValidator.validatePassword(input), "TC_01 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordWithoutSpecialCharacter(){
        String input = "Password01";
        assertFalse(loginValidator.validatePassword(input), "TC_02 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordWithoutNumber() {
        String input = "Password$";
        assertFalse(loginValidator.validatePassword(input), "TC_03 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordTooShort() {
        String input = "Pa$01";
        assertFalse(loginValidator.validatePassword(input), "TC_04 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordTooLong() {
        String input = "Password$01TooLongPassword";
        assertFalse(loginValidator.validatePassword(input), "TC_05 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordEmptyPasswordString() {
        String input = " ";
        assertFalse(loginValidator.validatePassword(input), "TC_06 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }
    @Test
    void validatePasswordNullPassword() {
        String input = null;
        assertFalse(loginValidator.validatePassword(input), "TC_07 Test Password's LoginValidator ClassValid " +
                "\n Rule: Password has to has 8-16 characters and contains at least one number and one special character."+
                "\n Test Data "+  input);
    }




}