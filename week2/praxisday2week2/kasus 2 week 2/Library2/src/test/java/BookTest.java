/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Akira
 */
public class BookTest {
    
    public BookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setBook method, of class Book.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        int kodeBuku = 0;
        String namaBuku = "";
        String tempJenisBuku = "";
        Book instance = new BookImpl();
        instance.setBook(kodeBuku, namaBuku, tempJenisBuku);
    }

    public class BookImpl implements Book {

        public void setBook(int kodeBuku, String namaBuku, String tempJenisBuku) {
        }
    }
    
}
