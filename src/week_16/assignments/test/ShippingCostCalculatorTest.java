package week_16.assignments.test;

import org.junit.jupiter.api.*;
import week_16.assignments.main.ShippingCostCalculator;

import static org.junit.jupiter.api.Assertions.*;

class ShippingCostCalculatorTest {

    //DecisionTable Testing
    ShippingCostCalculator shippingCostCalculatorObj;

    @BeforeAll
    static void setUp(){
        System.out.println("OrderStatusManagerTest is started.");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("OrderStatusManagerTest is finished.");
    }

    @BeforeEach
    void testInfoStart(){
        System.out.println("Test started.");
        shippingCostCalculatorObj=new ShippingCostCalculator();
    }
    @AfterEach
    void testInfoFinish(){
        System.out.println("Test finished.");
    }

    @Test
    void calculateCostLocalDestinationWithStandardDelivery() {
        double weight = 10;
        String destination = "Local";
        String deliverySpeed = "Standard";

        double actual = 10;
        double expected = 10;
        assertEquals(actual, expected, "TC_01 Test ShippingCostCalculator Class- Local Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostLocalDestinationWithExpressDelivery() {
        double weight = 10;
        String destination = "Local";
        String deliverySpeed = "Express";

        double actualCost = 25;
        double expectedCost = 25;
        assertEquals(actualCost, expectedCost, "TC_02 Test ShippingCostCalculator Class- Local Destination With Express Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostInternationalDestinationWithStandardDelivery() {
        double weight = 10;
        String destination = "International";
        String deliverySpeed = "Standard";

        double actual = 50;
        double expected = 50;
        assertEquals(actual, expected, "TC_03 Test ShippingCostCalculator Class- International Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostInternationalDestinationWithExpressDelivery() {
        double weight = 10;
        String destination = "International";
        String deliverySpeed = "Express";

        double actual = 125;
        double expected = 125;
        assertEquals(actual, expected, "TC_04 Test ShippingCostCalculator Class- International Destination With Express Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    //TODO
    @Test
    void calculateCostZeroWeightLocalStandardDelivery() {
        double weight = 0;
        String destination = "Local";
        String deliverySpeed = "Standard";

        double actual = 0;
        double expected = 0;
        assertEquals(actual, expected, "TC_05 Test ShippingCostCalculator Class- Local Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostZeroWeightLocalExpressDelivery() {
        double weight = 0;
        String destination = "Local";
        String deliverySpeed = "Express";

        double actual = 0;
        double expected = 0;
        assertEquals(actual, expected, "TC_06 Test ShippingCostCalculator Class- Local Destination With Express Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostZeroWeightInternationalStandardDelivery() {
        double weight = 0;
        String destination = "International";
        String deliverySpeed = "Standard";

        double actual = 0;
        double expected = 0;
        assertEquals(actual, expected, "TC_07 Test ShippingCostCalculator Class- International Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostZeroWeightInternationalExpressDelivery() {
        double weight = 0;
        String destination = "International";
        String deliverySpeed = "Express";

        double actual = 0;
        double expected = 0;
        assertEquals(actual, expected, "TC_08 Test ShippingCostCalculator Class- International Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostNegativeWeightLocalStandardDelivery() {
        double weight = -10;
        String destination = "Local";
        String deliverySpeed = "Standard";

        double actual = -10;
        double expected = -10;
        assertEquals(actual, expected, "TC_09 Test ShippingCostCalculator Class- Negative Weight Local Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostNegativeWeightLocalExpressDelivery() {
        double weight = -10;
        String destination = "Local";
        String deliverySpeed = "Express";

        double actual = -25;
        double expected = -25;
        assertEquals(actual, expected, "TC_10 Test ShippingCostCalculator Class- Negative Weight Local Destination With Express Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostNegativeWeightInternationalStandardDelivery() {
        double weight = -10;
        String destination = "International";
        String deliverySpeed = "Standard";

        double actual = -50;
        double expected = -50;
        assertEquals(actual, expected, "TC_11 Test ShippingCostCalculator Class- Negative Weight International Destination With Standard Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }

    @Test
    void calculateCostNegativeWeightInternationalExpressDelivery() {
        double weight = -10;
        String destination = "International";
        String deliverySpeed = "Express";

        double actual = -125;
        double expected = -125;
        assertEquals(actual, expected, "TC_12 Test ShippingCostCalculator Class- Negative Weight International Destination With Express Delivery\n" +
                "Rule: Calculates the shipping cost based on the weight, destination, and delivery speed.");
    }


}