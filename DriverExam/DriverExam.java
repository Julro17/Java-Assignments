/* Program: Ch7 EC PC6
   Date: 03-28-19
   Author: Julie Rohach
   Description: This is an extra credit assignment for CIT111. This class creates methods allowing for the entry of 20 chars & outputs an array, 2 ints,
   & a boolean. */
   
   public class DriverExam{
     private char[] correct = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'D', 'D', 'A'}, 
      exam = new char[20];
     private int wrong = 0;
     int[] missed; 
     private boolean passed = true;
      
//construct new driver exam using existing array of answers      
      public DriverExam(char[] in){             
         exam = in;
         int w = 0;
         
         for(int i = 0; i < 20; i++){
            if(exam[i] != correct[i]) w++;
         }
         wrong = w;
      }
   
//empty constructor
      public DriverExam(){}               
      
//array supplied becomes this driver exam's exam[], i.e. its set of user-supplied answers      
      public void setExam(char in[]){              
         exam = in;
         int w = 0;
         
         for(int i = 0; i < 20; i++){
            if(exam[i] != correct[i]) w++;
         }
         
         wrong = w;
      }
      
//determine whether the supplied set of answers passes the exam
      public boolean passed(){               
            if (wrong > 5) passed = false;
            
            return passed;   
       }
      
//return the numbers of correct answers in supplied set of answers      
      public int totalCorrect(){return (20 - wrong);}                
      
//return number of incorrect answers in supplied set of answers            
      public int totalIncorrect(){return wrong;}
      
//      
      public int[] questionsMissed(){
         missed = new int[wrong];
      int j = 0;
      
      if(wrong != 0){
         for(int i = 0; i < 20; i++){
            if(exam[i] != correct[i]){missed[j] = i;
               j++;}
           }} return missed;
      }
      
   }
   
   
   
