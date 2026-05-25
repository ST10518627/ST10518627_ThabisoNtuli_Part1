/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121desgn1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class MessageTest {
    // Test message objects using assignment test data
    private Message message1;
    private Message message2;
    public MessageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
     
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
          // Test Data Task 1
        message1 = new Message("+27718693002", "Hi Mike, can you join us for dinner tonight?");
        // Test Data Task 2
        message2 = new Message("08575975889", "Hi Keegan, did you receive the payment?");
    }
    
    @AfterEach
    public void teaDown() {  
    }    
    /**
     * 
     * Test of validateRecipientCell method, of class Message.
     */
    @Test
    public void testValidateRecipientCell() {
        System.out.println("validateRecipientCell");
        String recipient = "+27718693002";
        boolean expResult = true;
        boolean result = Message.validateRecipientCell(recipient);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validateMessageLength method, of class Message.
     */
    @Test
    public void testValidateMessageLength() {
        System.out.println("validateMessageLength");
        String messageText = "Hi Mike, can you join us for dinner tonight?";
        String expResult = "Message sent";
        String result = Message.validateMessageLength(messageText);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        boolean expResult = true;
        boolean result = message1.checkMessageID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        boolean expResult = true;
        boolean result = message1.checkRecipientCell();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessageLength method, of class Message.
     */
    @Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        String expResult = "true";
        String result = message1.checkMessageLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        // Test all hashes in a loop as required by assignment
        Message[] messages = {message1, message2};
        String[] expectedEndings = {":HITONIGHT", ":HIPAYMENT"};

        for (int i = 0; i < messages.length; i++) {
            String hash = messages[i].getMessageHash();
            assertTrue(hash.endsWith(expectedEndings[i]),
                    "Hash " + (i + 1) + " should end with '"
                    + expectedEndings[i] + "' but got: " + hash);
            assertTrue(hash.equals(hash.toUpperCase()),
                    "Hash should be all uppercase");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessageOption method, of class Message.
     */
    }
    @Test
    public void testSendMessageOption() {
        System.out.println("sendMessageOption");
        int choice = 1;
        String expResult = "Message successfully sent";
        String result = message1.sendMessageOption(choice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printMessages method, of class Message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        String expResult = "No messages sent yet";
        String result = Message.printMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = Message.returnTotalMessages();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        message1.storeMessage();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageID method, of class Message.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
         String result = message1.getMessageID();
        assertNotNull(result, "Message ID should not be null");
        assertTrue(result.length() <= 10,
                "Message ID generated: " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageHash method, of class Message.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
         String result = message1.getMessageHash();
        assertNotNull(result, "Message hash should not be null");
        assertTrue(result.endsWith(":HITONIGHT"),
                "Hash should end with :HITONIGHT but got: " + result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRecipient method, of class Message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        String expResult = "+27718693002";
        String result = message1.getRecipient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageText method, of class Message.
     */
    @Test
    public void testGetMessageText() {
        System.out.println("getMessageText");
        String expResult = "Hi Mike, can you join us for dinner tonight?";
        String result = message1.getMessageText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageNumber method, of class Message.
     */
    @Test
    public void testGetMessageNumber() {
        System.out.println("getMessageNumber");
        int expResult = 0;
        int result = message1.getMessageNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Message.
     */
    @Test
    public void testGetTimestamp() {
       // System.out.println("getTimestamp")
       // String expResult = "";
        //String result = message1.getTimestamp();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    }
    

