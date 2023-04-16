/* Program: Ch7 EC PC6
   Date: 03-28-19
   Author: Julie Rohach
   Description: This is an extra credit assignment for CIT111. It implements a class allowing for the entry of 20 chars (multiple choice test 
   answers) & outputs a boolean indicating whether the exam is passed (up to 5 incorrect answers only), an array listing
   the problems answered incorrectly, 1 int indicating the # of correct answers, and another indicating those incorrect. */
  
  import java.util.*;
  import java.lang.*;
  
  public class DriverExamInterface{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      
      char[] test = new char[20];
      String input;
      int i = 0;
      
      System.out.print("(USE CAPS and no extra characters) \nEnter answer for question ");
      
      do{do{
         System.out.print((i + 1) + ":");
            input = in.nextLine().trim();             //get user input minus extra whitespace
         
         if(input.length() != 1) test[i] = 0;            //ensure input is exactly one character long; if not, get input for same problem # again
         else{test[i] = input.charAt(0);}
      } while(test[i] != 'A' && test[i] != 'B' && test[i] != 'C' && test[i] != 'D');
         i++;} while(i < 20);
      
   
   DriverExam exam = new DriverExam(test);               //create new exam instance using array of given answers
   
   System.out.print("Exam");
   
   if(!exam.passed()) System.out.print(" not");             //include the word "not" when displaying exam results if exam not passed
   
   System.out.printf(" passed.\n# Correct: %d\n# Incorrect: %d\n", exam.totalCorrect(), exam.totalIncorrect());            //display # correct and incorrect answers
   
   int[] missed = exam.questionsMissed();
   
   if(missed.length > 0){System.out.print("Questions incorrect: ");              //displays questions answered incorrectly, if any
      for(int x = 0; x < missed.length; x++){
         System.out.print((1 + missed[x]) + " ");
      }
   }
     
   }
}