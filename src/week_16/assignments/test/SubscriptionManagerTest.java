package week_16.assignments.test;

import org.junit.jupiter.api.*;
import week_16.assignments.main.SubscriptionManager;

import static org.junit.jupiter.api.Assertions.*;

class SubscriptionManagerTest {

    SubscriptionManager subscriptionManager;

    @BeforeAll
    static void setUp() {
        System.out.println("OrderStatusManagerTest is started.");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("OrderStatusManagerTest is finished.");
    }

    @BeforeEach
    void testInfoStart() {
        System.out.println("Test started.");
        subscriptionManager = new SubscriptionManager();
    }

    @AfterEach
    void testInfoFinish() {
        System.out.println("Test finished.");
    }

    @Test
    void subscriptionManagerTestFreeTierEmailNotificationsEnabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
               SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, AutoRenewal=ENABLED",actual,"TC_01 Test SubscriptionManager Class for " +
                "FREE tier, EMAIL notifications, ENABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }
    @Test
    void subscriptionManagerTestStandardTierSMSNotificationsDisabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, AutoRenewal=DISABLED",actual,"TC_02 Test SubscriptionManager Class for " +
                "STANDARD tier, SMS notifications, DISABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }

    @Test
    void subscriptionManagerTestPremiumTierNoneNotificationsEnabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.NONE, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, AutoRenewal=ENABLED",actual,"TC_03 Test SubscriptionManager Class for " +
                "PREMIUM tier, NONE notifications, ENABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }

    @Test
    void subscriptionManagerTestFreeTierSMSNotificationsDisabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, AutoRenewal=DISABLED",actual,"TC_04 Test SubscriptionManager Class for " +
                "FREE tier, SMS notifications, DISABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }

    @Test
    void subscriptionManagerTestStandardTierEmailNotificationsEnabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
                SubscriptionManager.NotificationPreference.EMAIL, SubscriptionManager.AutoRenewal.ENABLED);

        assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, AutoRenewal=ENABLED",actual,"TC_05 Test SubscriptionManager Class for " +
                "STANDARD tier, EMAIL notifications, ENABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }

    @Test
    void subscriptionManagerTestPremiumTierSMSNotificationsDisabledAutoRenewal(){
        String actual=subscriptionManager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
                SubscriptionManager.NotificationPreference.SMS, SubscriptionManager.AutoRenewal.DISABLED);

        assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, AutoRenewal=DISABLED",actual,"TC_06 Test SubscriptionManager Class for " +
                "PREMIUM tier, SMS notifications, DISABLED auto-renewal. \n" +
                "Rule:Method --> configureSubscription() is not working.");
    }






}