// Anna George 20 July 2019
// Intro to Java Programming
// 20 July 2019
//AMGStatistics.java
//prompts user for number of each coin type and gives them total amount

/*
getDollarAmount()
   passes number of each coin through
   define variables for total value
   calculate total
   display total
main()
   define quarters
   define dimes
   define nickles
   define pennies
   get user input for quarters
   get user input for dimes
   get user input for nickles
   get user input for pennies
   call getDolllarAmount method
*/

import java.util.Scanner; //importing needed utilities
import java.util.Random;
import java.lang.Math;
import java.lang.String;
public class Keys {
   public static void main(String[] args) {
      String key1 = "";
      String key2 = "";
      String key3 = "";
      
      Scanner input1 = new Scanner(System.in);

     String guess1 = input1.nextLine();
      if (guess1.equals("the")) {
         System.out.println("Congrats");
      } else {
         System.out.println("no");
      }
   }


}
