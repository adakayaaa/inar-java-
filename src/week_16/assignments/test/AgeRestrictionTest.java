package week_16.assignments.test;

import org.junit.jupiter.api.*;
import week_16.assignments.main.AgeRestrictionValidator;

import static org.junit.jupiter.api.Assertions.*;

class AgeRestrictionTest {

    //Boundary Value Analysis
    AgeRestrictionValidator ageRestrictionObj=new AgeRestrictionValidator();

    private static int testCaseNumber=0;


    @BeforeEach
    void setUp(){
        testCaseNumber++;
        System.out.println("Test Case Number:" + testCaseNumber );

    }
    @AfterEach
    void tearDown(){
        System.out.println("Test case finished.");
    }

    @BeforeAll
    static void testInfo(){
        System.out.println("AgeRestrictionTest started.");
    }
    @AfterAll
    static void testFinish(){
        System.out.println("AgeRestrictionTest finished.");
    }

    @Test
    void eligibleAgeJustBelowMinimum(){
        int input=17;
        assertFalse(ageRestrictionObj.isEligible(input),"TC_01 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleAgeAtMinimumBoundary(){
        int input=18;
        assertTrue(ageRestrictionObj.isEligible(input),"TC_02 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleAgeJustAboveMinimum(){
        int input=19;
        assertTrue(ageRestrictionObj.isEligible(input),"TC_03 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleAgeJustBelowMaximum(){
        int input=64;
        assertTrue(ageRestrictionObj.isEligible(input),"TC_04 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleAgeAtMaximumBoundary(){
        int input=65;
        assertTrue(ageRestrictionObj.isEligible(input),"TC_05 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleAgeJustAboveMaximum(){
        int input=66;
        assertFalse(ageRestrictionObj.isEligible(input),"TC_06 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleExtremeLowAge(){
        int input=0;
        assertFalse(ageRestrictionObj.isEligible(input),"TC_07 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);
    }
    @Test
    void eligibleExtremeHighAge(){
        int input=100;
        assertFalse(ageRestrictionObj.isEligible(input),"TC_08 Test AgeRestrictionValidator ClassValid\n" +
                "Rule: The user's age is within the legal range for age-restricted content. (18<=age<=65\n" +
                "input-->" +input);

    }

}