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
public class TransactionTest {
    
    public TransactionTest() {
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
     * Test of setpengembalianBuku method, of class Transaction.
     */
    @Test
    public void testSetpengembalianBuku() {
        System.out.println("setpengembalianBuku");
        int kodeTransaksi = 0;
        Transaction instance = new Transaction();
        instance.setpengembalianBuku(kodeTransaksi);
    }

    /**
     * Test of pengembalianBuku method, of class Transaction.
     */
    @Test
    public void testPengembalianBuku() {
        System.out.println("pengembalianBuku");
        String tempJenisBuku = "";
        Transaction instance = new Transaction();
        String expResult = "";
        String result = instance.pengembalianBuku(tempJenisBuku);
        assertEquals(expResult, result);
    }

    /**
     * Test of setBook method, of class Transaction.
     */
    @Test
    public void testSetBook() {
        System.out.println("setBook");
        int kodeBuku = 0;
        String namaBuku = "";
        String tempJenisBuku = "";
        Transaction instance = new Transaction();
        instance.setBook(kodeBuku, namaBuku, tempJenisBuku);
    }

    /**
     * Test of cetakBuktiPeminjaman method, of class Transaction.
     */
    @Test
    public void testCetakBuktiPeminjaman() {
        System.out.println("cetakBuktiPeminjaman");
        Transaction instance = new Transaction();
        instance.cetakBuktiPeminjaman();
    }
    
}
