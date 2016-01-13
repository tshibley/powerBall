import java.util.*;

public class powerBall {

   public static void main (String []args) {
      Random r = new Random(); 
      Scanner s = new Scanner(System.in);
      boolean match5 = false; 
      int count = 0; 
      int match5Count = 0; 
      boolean winner = false;  
      int powerBall = 0; 
      
      System.out.println("This Program simulates powerBall, just");
      System.out.println("pick your 5 numbers + powerBall and you're"); 
      System.out.println("Ready to go!");
      
      System.out.println("Pick Number One (1-69): ");
      int num1 = s.nextInt();  
      System.out.println("Pick Number Two (1-69): ");
      int num2 = s.nextInt();  
      System.out.println("Pick Number Three (1-69): ");
      int num3 = s.nextInt();  
      System.out.println("Pick Number Four (1-69): ");
      int num4 = s.nextInt();  
      System.out.println("Pick Number Five (1-69): ");       
      int num5 = s.nextInt();
      System.out.println("Pick Powerball Number  (1-26): ");
      int power = s.nextInt();   
      Set<Integer> nums = new TreeSet<Integer>();
      nums.add(num1);
      nums.add(num2);
      nums.add(num3);
      nums.add(num4); 
      nums.add(num5); 
      
      while (winner == false) {
         while (match5 == false) {
            count++; 
            match5 = draw5(r, nums);
            System.out.println("Total Entries: " + count + "     Match 5's: " + match5Count);
         }
         match5Count++;
         powerBall = r.nextInt(26) + 1; 
         if (powerBall == power) {
            winner = true; 
         }
         match5 = false;
      }
      System.out.println("Jackpot!");
      System.out.println(powerBall); 
   }
   
   
   
   public static boolean draw5(Random r, Set nums){
      int drawOne = r.nextInt(69) + 1;
      if (nums.contains(drawOne) == false) {
         return false;
      } 
      int drawTwo = r.nextInt(69) + 1; 
      while (drawTwo == drawOne){
         drawTwo = r.nextInt(69) + 1; 
      }
      if (nums.contains(drawTwo) == false) {
         return false;
      } 
      int drawThree = r.nextInt(69) + 1; 
      while (drawThree == drawOne || drawThree == drawTwo){
         drawThree = r.nextInt(69) + 1; 
      }  
      if (nums.contains(drawThree) == false) {
         return false;
      } 
      int drawFour = r.nextInt(69) + 1; 
      while (drawFour == drawOne || drawFour == drawTwo || drawFour == drawThree){
         drawFour = r.nextInt(69) + 1; 
      }  
      if (nums.contains(drawFour) == false) {
         return false;
      } 
      int drawFive = r.nextInt(69) + 1; 
      while (drawFive == drawOne || drawFive == drawTwo || drawFive == drawThree || drawFive == drawFour){
         drawFive = r.nextInt(69) + 1; 
      }
      if (nums.contains(drawFive) == false) {
         return false;
      } 
      System.out.println(drawOne + "  " + drawTwo + "  " + drawThree + "  " + drawFour + "  " + drawFive); 
      return true; 
   }
}