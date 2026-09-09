/*
 *	Author:  
 *  Date: 
*/

class starter {
	public static void main(String args[]) {
        // ===================================================
        // SECTION 1: Declaring int and double variables
        // ===================================================
        int applesPicked = 12;
        double boxWeightLbs = 2.5;       
 
        System.out.println("Apples picked: " + applesPicked);
        System.out.println("Box weight: " + boxWeightLbs);
        // Expected:
        // Apples picked: 12
        // Box weight: 2.5

        // ===================================================
        // SECTION 2: Basic arithmetic (+, -, *)
        // ===================================================
 
        int applesPerBasket = 4;
        int totalBaskets = applesPicked*applesPerBasket;
        
 
        System.out.println("Total baskets: " + totalBaskets);
        // Expected: Total baskets: 48
 
 
        // ===================================================
        // SECTION 3: Integer division vs. double division
        // ===================================================
        // Careful! Dividing two ints in Java performs INTEGER division,
        // which drops (truncates) any remainder.
 
        int totalCookies = 17;
        int studentsInClass = 5;
 
        int cookiesPerStudentInt = totalCookies/studentsInClass;
        
 
        System.out.println("Cookies per student (int division): " + cookiesPerStudentInt);
        // Expected: Cookies per student (int division): 3
        // (17 / 5 = 3.4, but int division truncates to 3)
 
        double cookiesPerStudentDouble = totalCookies*1.0/studentsInClass;
        
 
        System.out.println("Cookies per student (double division): " + cookiesPerStudentDouble);
        // Expected: Cookies per student (double division): 3.4

 
        // ===================================================
        // SECTION 4: The modulo operator (%)
        // ===================================================
        // % gives you the REMAINDER left over after division.

        int leftoverCookies = totalCookies%studentsInClass; 
        
 
        System.out.println("Leftover cookies: " + leftoverCookies);
        // Expected: Leftover cookies: 2

 
        // ===================================================
        // SECTION 5: Mixing int and double in one expression
        // ===================================================
 
        double pricePerApple = 0.35;
 
        double totalCost = applesPicked*pricePerApple;
 
        System.out.println("Total cost: $" + totalCost);
        // Expected: Total cost: $4.2
 
        // ===================================================
        // SECTION 6: Order of operations
        // ===================================================
 
        int mathResult = (8 + 2) * 3 - 10 / 2;
        
		
        System.out.println("Math result: " + mathResult);
        // Expected: Math result: 25
    }
}