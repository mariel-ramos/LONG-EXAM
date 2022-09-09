public class Char {

     private static int i;
    public static void main(String[] args) {
        
         //Create an array of characters of your favorite fruit
         char[] Banana = { 'B', 'A', 'N', 'A', 'N', 'A' };

         //Display each array of character of the fruit in each line
          for (int i = 0; i < Banana.length; i++) {
            System.out.println(Banana[i]);
         }

         //Display the first character of the fruit
          System.out.println(Banana[0]);

         //Display the last character of the fruit
          System.out.println(Banana[5]);

         //Display the character of the fruit in reverse order
         for (int i = Banana.length - 1; i >= 0; i--) {
            System.out.println(Banana[i]);
         }
        
    }

       


        
    }
