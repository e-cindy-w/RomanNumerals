/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import java.lang.IllegalArgumentException;


/**
 *
 * @author Elsie Cindy
 */
public class RomanNumeralUnitTests {

    
    public RomanNumeralUnitTests() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
// Test cases
//    Single Letters:I, V, X, L, C, D, M.
//    Many Letters: XI
//    Subtractive notation (SN):IV
//    With and without SN:XIV
//    Repetition:II
//    First number:I
//    inValid Letter:Z
//    Invalid and valid Letter: XIZ
//    Not Valid:VV
//    Null:

    @Test
    public void firstLetter() {
        RomanNumeral converter = new RomanNumeral();
        int result = converter.convertToInteger("V");
        assertEquals(5, result);
    }
    
    @Test
    public void singleLetter() {
        RomanNumeral converter = new RomanNumeral();
        int result = converter.convertToInteger("V");
        assertEquals(5, result);
    }
    
    @Test
    public void repetition() {
        int result = new RomanNumeral().convertToInteger("XX");
        Assertions.assertEquals(20, result);
     }
    
    @Test
    public void manyLetters(){
        int result = new RomanNumeral().convertToInteger("VII");
        Assertions.assertEquals(7,result);
    }
    
    @Test
    public void subtractiveNotation(){
        int result = new RomanNumeral().convertToInteger("IV");
        Assertions.assertEquals(4,result);
    }
    
    @Test
    public void withNwithoutSN(){
        int result = new RomanNumeral().convertToInteger("XIV");
        Assertions.assertEquals(14,result);
    }
        
    @Test
    public void invalidLetter() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThrows(IllegalArgumentException.class, () -> romanNumeral.convertToInteger("Y"));
    }
    
         @Test
    public void nullInput() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThrows(IllegalArgumentException.class, () -> romanNumeral.convertToInteger(null));
    }
    
    @Test
    public void isEmptyInput() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThrows(IllegalArgumentException.class, () -> romanNumeral.convertToInteger(" "));
    }
    
    @Test
    public void invalidAndValidLetter() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThrows(IllegalArgumentException.class, () -> romanNumeral.convertToInteger("XIZ"));
    }
    
     @Test
    public void notVaild() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertThrows(IllegalArgumentException.class, () -> romanNumeral.convertToInteger("VV"));
    }

}
