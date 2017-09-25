package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

   // iki array içerisinde verilen sayı kadar aynı eleman varsa true döner.
    public void testCorrectNumberOfDuplicates(){
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "Elif", "Mehmet", "Reyhan"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertTrue(new App().search(array1,array2, 2));
    }

   // iki array içerisinde verilen sayıdan farklı aynı eleman varsa false döner.
    public void testFalseNumberOfDuplicates() {
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "Elif", "Mehmet", "Reyhan"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertFalse(new App().search(array1,array2, 3));
    }

   // bir array içerisinde aynı string birden fazla kez geçiyorsa bir kere yazılmış gibi ele alınır. (lowercase-uppercase insensitive)
    public void testArrayThatHasDuplicateElements() {
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "emre", "Mehmet"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "emre", "Mehmet"));
      assertFalse(new App().search(array1,array2, 2));
    }

    // lowercase-uppercase karakterler fark etmez.
    public void testLowerCaseUpperCaseDoesNotMatter() {
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "elif", "meHmet", "Reyhan"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertTrue(new App().search(array1,array2, 2));
    }
   // empty array varsa false döner.
    public void testEmptyArray() {
      ArrayList<String> array1 = new ArrayList<>();
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertFalse(new App().search(array1,array2, 1));
    }

    // null array varsa false döner.
    public void testNull() {
      assertFalse(new App().search(null,null, 1));
    }

    // karşılaştırma yapacağımız sayı engatif verilirse false döner.
    public void testGivenNumberIsNegative() {
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "Elif", "Mehmet", "Reyhan"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertFalse(new App().search(array1,array2, -1));
    }

    // girilen sayı array'lerden herhangi birinin size'ından büyük olursa o indeksli eleman 
    //olamayağından eleman karşılaştırması yapmadan false döner.
    public void testGivenNumberIsBiggerThanArraySize() {
      ArrayList<String> array1 = new ArrayList<>(Arrays.asList("Emre", "Elif", "Mehmet", "Reyhan"));
      ArrayList<String> array2 = new ArrayList<>(Arrays.asList("Ekin", "Elif", "Mehmet", "Zekiye"));
      assertFalse(new App().search(array1,array2, 6));
    }
}
