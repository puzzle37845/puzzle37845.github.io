

import java.util.Scanner; //importing needed utilities
import java.util.Random;
import java.lang.Math;
import java.lang.String;
import java.applet.Applet;
import java.awt.Graphics;
public class Keys extends Applet {
   public static void main(String[] args) {
      String key1 = "";
      String key2 = "";
      String key3 = "";
      System.out.println("hello");
      Scanner input1 = new Scanner(System.in);

     String guess1 = input1.nextLine();
      if (guess1.equals("the")) {
         System.out.println("Congrats");
      } else {
         System.out.println("no");
      }
   }


}
