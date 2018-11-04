package ch05.ex05_10;

import java.util.Scanner;
// Exercise 5.10: Counting.java
public class Counting {
    public static void main( String[] args ) {

        Scanner s = new Scanner(System.in);

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 5; j++)
                System.out.print('*');
            System.out.println("\n#####");
        } // end outer for loop
    } // end main
} // end class Counting

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
