/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elsie Cindy
 */
public class RomanNumeral {
    public int convertToInteger(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty.");
        }
        if (!romanNumeral.matches("^(M{0,4})(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$")) {
             throw new IllegalArgumentException("Invalid input: " + romanNumeral);
        }

        int result = 0;
        int prev = 0;
        
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            
            int current = romanNumeralToValue(romanNumeral.charAt(i));
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
            prev = current;
        }

        if (result == 0) {
            throw new IllegalArgumentException("Invalid input: " + romanNumeral);
        }

        return result;
        
    }

    private int romanNumeralToValue(char c) {
        switch (c) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
            default -> throw new IllegalArgumentException("Invalid input: ");
        }
    }
    
}
