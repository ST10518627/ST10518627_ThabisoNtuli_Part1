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
public class PROG5121DESGN1Test {
    
    public PROG5121DESGN1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    
    /**
     * Test of checkUserName method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyl_1";
        boolean expResult = true;
        boolean result = PROG5121DESGN1.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkPasswordComplexity method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = PROG5121DESGN1.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellNumber = "+27838968976";
        boolean expResult = true;
        boolean result = PROG5121DESGN1.checkCellPhoneNumber(cellNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String expResult = "";
        String result = PROG5121DESGN1.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredPassword = "";
        String storedUsername = "";
        String storedPassword = "";
        boolean expResult = false;
        boolean result = PROG5121DESGN1.loginUser(enteredUsername, enteredPassword, storedUsername, storedPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginSuccess = false;
        String Name = "";
        String Surname = "";
        String expResult = "";
        String result = PROG5121DESGN1.returnLoginStatus(loginSuccess, Name, Surname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PROG5121DESGN1.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PROG5121DESGN1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
