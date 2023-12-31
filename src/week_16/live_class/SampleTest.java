package week_16.live_class;

import org.junit.jupiter.api.*;

class SampleTest {
    @BeforeAll
    static void setUp(){
        System.out.println(" @BeforeAll Setting up shared resources...");
    }

    @BeforeEach
    void init(){
        System.out.println("@BeforeEach Starting a new test...");
    }

    @Test
    void testExample(){
        System.out.println("Running testExample...");
        Assertions.assertTrue(3>2, "Check if 3 is greater than 2");
    }
    @Test
    void testExample2(){
        System.out.println("Running testExample...");
        Assertions.assertTrue(5<8, "Check if 5 is not greater than 8");
    }
    @AfterEach
    void tearDown(){
        System.out.println(" @AfterEach Cleaning up after a test...");
    }
    @AfterAll
    static void cleanup() {
        System.out.println("@AfterAll Cleaning up shared resources...");
    }

}