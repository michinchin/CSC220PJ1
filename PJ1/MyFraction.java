/*************************************************************************************
 *
 * Important: please look at "Cheating and Plagiarism Policy"
 *            http://cs.sfsu.edu/cheating-and-plagiarism-policy
 *
 * Warning: Don't copy projects from previous semestsres and others!
 *
/*************************************************************************************
 *
 * This class represents a fraction whose numerator and denominator are integers.
 *
 * Requirements:
 * 1. Implement interfaces: MyFractionInterface and Comparable (i.e. compareTo())
 * 2. Implement methods equals() and toString() from class Object
 * 3. Implement static method gcd() using non-recursive algorithm. 
 *    Plaese Refer to strategy in given GCD recursive method.
 *
 * 4. Should work for both positive and negative fractions
 * 5. Must always reduce fraction to lowest term (see Hints 1. below)
 * 6. For a fraction such as 3/-10, it is same as -3/10 (see Hints 2. below)
 * 7. Must display negative fraction as -x/y,
 *         example: (-3)/10 or 3/(-10), must display as -3/10
 * 8. Must throw MyFractionException objects in case of errors, 
 *    must not throw other exception objects
 * 9. Must not add new or modify existing data fields
 * 10. Must not add new public methods
 * 11. May add private methods
 *
 * Hints:
 *
 * 1. To reduce a fraction such as 4/8 to lowest terms, you need to divide both
 *    the numerator and the denominator by their greatest common denominator.
 *    The greatest common denominator of 4 and 8 is 4, so when you divide
 *    the numerator and denominator of 4/8 by 4, you get the fraction 1/2.
 *    The recursive method GCD() which finds the greatest common denominator of
 *    two positive integers is given (see code)
 *       
 * 2. It will be easier to determine the correct sign of a fraction if you force
 *    the fraction's denominator to be positive. However, your implementation must 
 *    handle negative denominators that the client might provide.
 *           
 * 3. You need to downcast reference parameter MyFractionInterface to MyFraction if  
 *    you want to use it as MyFraction. See add, subtract, multiply and divide methods
 *
 * 4. Use "this" to access this object if it is needed
 *
 ************************************************************************************/

package PJ1;

public class MyFraction implements MyFractionInterface, Comparable<MyFraction>
{
	// integer numerator and denominator
	private	int num;	
	private	int den;	

	public MyFraction()
	{
        num = 0;
        den = 1;
        // implement this method!
		// set fraction to default = 0/1
	}	// end default constructor

	public MyFraction(int num, int den)
	{
        
        if (initialDenominator = 0){
            return MyFractionException;
        }
		// implement this method!
	}	// end constructor

	public void setMyFraction(int num, int den)
	{
        this.num = num;
        this.den = den;
        
        if (initialDenominator = 0){
            return MyFractionException;
        }
		// implement this method!
		// return MyFractionException if initialDenominator is 0
	}	// end setMyFraction

	public double toDouble()
	{
		// implement this method!
		// return double floating point value
		return 0.0;
	}	// end toDouble 

	public MyFractionInterface add(MyFractionInterface secondFraction)
	{
		// implement this method!
		// a/b + c/d is (ad + cb)/(bd)
		// return result which is a new MyFraction object
		return null;
	}	// end add

	public MyFractionInterface subtract(MyFractionInterface secondFraction)
	{
		// implement this method!
		// a/b - c/d is (ad - cb)/(bd)
		// return result which is a new MyFraction object
		return null;
	}	// end subtract

	public MyFractionInterface multiply(MyFractionInterface secondFraction)
	{
		// implement this method!
		// a/b * c/d is (ac)/(bd)
		// return result which is a new MyFraction object
		return null;
	}	// end multiply

	public MyFractionInterface divide(MyFractionInterface secondFraction)
	{
		// implement this method!
		// a/b / c/d is (ad)/(bc)
		// return MyFractionException if secondFraction is 0
		// return result which is a new MyFraction object
		return null;
	}	// end divide

	
        /* Static method to compute GCD of 2 integers
         * Must Use non-recursive algorithm!! Refer to the given GCD() recursive method.
         * return -1 to indicate invalid gcd if (X < 0) or (y < 0) or (x=0 and y=0) */
	public static int gcd(int x, int y) 
	{
		// implement this method!
		// must implement non-recursive method ... see GCD() 
		return -1;
	} // end gcd


	public boolean equals(Object other)
	{
		// implement this method!
		return false;
	} // end equals


	public int compareTo(MyFraction other)
	{
		// implement this method!
		return 0;
	} // end compareTo

	
	public String toString()
	{
		return num + "/" + den;
	} // end toString


	/** Task: Reduces a fraction to lowest terms. */

        //-----------------------------------------------------------------
        //  private methods start here
        //-----------------------------------------------------------------

	private void reduceMyFractionToLowestTerms()
	{
                // implement this method!
                //
                // Outline:
                // compute GCD of num & den
                // GCD works for + numbers.
                // So, you should eliminate - sign
                // then reduce numbers : num/GCD and den/GCD
	}	// end reduceMyFractionToLowestTerms

  	/** Task: Computes the greatest common divisor of two integers.
	 *        This is a recursive method!!
	 *  @param integerOne	 an integer
	 *  @param integerTwo	 another integer
	 *  @return the greatest common divisor of the two integers */
	private int GCD(int integerOne, int integerTwo)
	{
		 int result;

		 if (integerOne % integerTwo == 0)
			result = integerTwo;
		 else
			result = GCD(integerTwo, integerOne % integerTwo);

		 return result;
	}	// end GCD


	//-----------------------------------------------------------------
	//  Some tests are given here 

	public static void main(String[] args)
	{
		MyFractionInterface firstOperand = null;
		MyFractionInterface secondOperand = null;
		MyFractionInterface result = null;
                double doubleResult = 0.0;

		MyFraction nineSixteenths = new MyFraction(9, 16);  // 9/16
		MyFraction oneFourth = new MyFraction(1, 4);        // 1/4

		System.out.println("\n=========================================\n");
		// 7/8 + 9/16
		firstOperand = new MyFraction(7, 8);
		result = firstOperand.add(nineSixteenths);
		System.out.println("The sum of " + firstOperand + " and " +
				nineSixteenths + " is \t\t" + result);
		System.out.println("\tExpected result :\t\t23/16\n");

		// 9/16 - 7/8
		firstOperand = nineSixteenths;
		secondOperand = new MyFraction(7, 8);
		result = firstOperand.subtract(secondOperand);
		System.out.println("The difference of " + firstOperand	+
				" and " +	secondOperand + " is \t" + result);
		System.out.println("\tExpected result :\t\t-5/16\n");


		// 15/-2 * 1/4
		firstOperand = new MyFraction(15, -2); 
		result = firstOperand.multiply(oneFourth);
		System.out.println("The product of " + firstOperand	+
				" and " +	oneFourth + " is \t" + result);
		System.out.println("\tExpected result :\t\t-15/8\n");

		// (-21/2) / (3/7)
		firstOperand = new MyFraction(-21, 2); 
		secondOperand= new MyFraction(3, 7); 
		result = firstOperand.divide(secondOperand);
		System.out.println("The quotient of " + firstOperand	+
				" and " +	secondOperand + " is \t" + result);
		System.out.println("\tExpected result :\t\t-49/2\n");

		// -21/2 + 7/8
		firstOperand = new MyFraction(-21, 2); 
		secondOperand= new MyFraction(7, 8); 
		result = firstOperand.add(secondOperand);
		System.out.println("The sum of " + firstOperand	+
				" and " +	secondOperand + " is \t\t" + result);
		System.out.println("\tExpected result :\t\t-77/8\n");


                // 0/10, 5/(-15), (-22)/7
		firstOperand = new MyFraction(0, 10); 
                doubleResult = firstOperand.toDouble();
		System.out.println("The double floating point value of " + firstOperand	+ " is \t" + doubleResult);
		System.out.println("\tExpected result \t\t\t0.0\n");
		firstOperand = new MyFraction(1, -3); 
                doubleResult = firstOperand.toDouble();
		System.out.println("The double floating point value of " + firstOperand	+ " is \t" + doubleResult);
		System.out.println("\tExpected result \t\t\t-0.333333333...\n");
		firstOperand = new MyFraction(-22, 7); 
                doubleResult = firstOperand.toDouble();
		System.out.println("The double floating point value of " + firstOperand	+ " is \t" + doubleResult);
		System.out.println("\tExpected result \t\t\t-3.142857142857143");
		System.out.println("\n=========================================\n");
		firstOperand = new MyFraction(-21, 2); 
		System.out.println("First = " + firstOperand);
		// equality check
		System.out.println("check First equals First: ");
		if (firstOperand.equals(firstOperand))
			System.out.println("Identity of fractions OK");
		else
			System.out.println("ERROR in identity of fractions");

		secondOperand = new MyFraction(-42, 4); 
		System.out.println("\nSecond = " + secondOperand);
		System.out.println("check First equals Second: ");
		if (firstOperand.equals(secondOperand))
			System.out.println("Equality of fractions OK");
		else
			System.out.println("ERROR in equality of fractions");

		// comparison check
		MyFraction first  = (MyFraction)firstOperand;
		MyFraction second = (MyFraction)secondOperand;
		
		System.out.println("\ncheck First compareTo Second: ");
		if (first.compareTo(second) == 0)
			System.out.println("MyFractions == operator OK");
		else
			System.out.println("ERROR in fractions == operator");

		second = new MyFraction(7, 8);
		System.out.println("\nSecond = " + second);
		System.out.println("check First compareTo Second: ");
		if (first.compareTo(second) < 0)
			System.out.println("MyFractions < operator OK");
		else
			System.out.println("ERROR in fractions < operator");

		System.out.println("\ncheck Second compareTo First: ");
		if (second.compareTo(first) > 0)
			System.out.println("MyFractions > operator OK");
		else
			System.out.println("ERROR in fractions > operator");

		System.out.println("\n=========================================");

		System.out.println("\ncheck MyFractionException: 1/0");
		try {
			MyFraction a1 = new MyFraction(1, 0);		    
		        System.out.println("Error! No MyFractionException");
		}
		catch ( MyFractionException fe )
           	{
              		System.err.printf( "Exception: %s\n", fe );
           	} // end catch
		System.out.println("Expected result : MyFractionException!\n");

		System.out.println("\ncheck MyFractionException: division");
		try {
			MyFraction a2 = new MyFraction();		    
			MyFraction a3 = new MyFraction(1, 2);		    
			a3.divide(a2);
		        System.out.println("Error! No MyFractionException");
		}
		catch ( MyFractionException fe )
           	{
              		System.err.printf( "Exception: %s\n", fe );
           	} // end catch
		System.out.println("Expected result : MyFractionException!\n");

		System.out.println("\ncheck static gcd(204,504)");
		System.out.println("Result: " + gcd(204,504));
		System.out.println("Expected result : 12\n");

		System.out.println("\ncheck static gcd(0,504)");
		System.out.println("Result: " + gcd(0,504));
		System.out.println("Expected result : 504\n");

		System.out.println("\ncheck static gcd(204,-10)");
		System.out.println("Result: " + gcd(204,-10));
		System.out.println("Expected result : -1\n");

	}	// end main
} // end MyFraction

