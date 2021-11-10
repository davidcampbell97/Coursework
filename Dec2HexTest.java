package Java;
import org.junit.Before;
import org.junit.Test;


import org.junit.*;
import static org.junit.Assert.*;

public class Dec2HexTest {
    private Dec2Hex dec2Hex;

    @Before
    public void setUp() throws Exception {
        dec2Hex = new Dec2Hex();

    }

    @Test
    //should test positive integer input
    public void testPositiveNumber() {
        assertEquals("Should return D4", dec2Hex.calculateHex("212"),"D4");
    }
    @Test
    public void testPositiveNumber2() {
        assertEquals("Should return 1", dec2Hex.calculateHex("1"),"1");
    }
    @Test
    public void testPositiveNumber3() {
        assertEquals("Should return 1602", dec2Hex.calculateHex("5634"),"1602");
    }


   // @Test
    //should test no input
    //public void testNoInput() {
      //  assertEquals("Should return error message", dec2Hex.calculateHex(null), " ");
  //  }


    @Test
    //Should test negative integer input
    public void testNegativeNumber() {
        assertEquals("Should return -D4", dec2Hex.calculateHex("-212"), "-D4");
    }

   // @Test
   // public void testNonIntegerInput(){
    //    assertEquals(null, dec2Hex.calculateHex("B"));
   // }

    @Test
    public void testZero(){
        assertEquals("Should return 0", "0", dec2Hex.calculateHex("0"));
    }
    //@Test
  //  public void testText(){
      // assertEquals("Should return 0", "", dec2Hex.calculateHex("Hello World"));
//
   // }

}
