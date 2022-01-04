/* 
 * TCSS 143 - Autumn 2021
 * Instructor: Raghavi Sakhpal
 * QuestionMC Class for QuizBowl
 */
 
import java.util.*;
import java.io.*;

/**
 * Object class that keeps track of the information regarding multiple
 * choice question extends abstract Question
 *
 * @author Amtoj Kaur amtojk@uw.edu
 * @version November 05, 2021
 */
public class QuestionMC extends Question{
   
   //private instance feilds.
   private ArrayList<String> multChoice;
   private String rightAns;
   
   /**
    * QuestionMC Cosntructor Method - takes four parameters, a String
    * name that is the question, an Integer point that is the number 
    * of points a question is worth, String answer for right answer 
    * and an arraylist to store the mult choice.
    * 
    * @param name - is the question that will be asked
    * @param points - points a question is worth
    * @param rightAns - stores right answer
    * @param multChoice - stores options
    * 
    * @return - void
    */
   public QuestionMC(String name, int point, String rightAns, ArrayList<String> multChoice) {
      super(name, point);
      this.rightAns = rightAns;
      this.multChoice = multChoice;
   }
   /**
    * Get method for answer helps access private feild of answer
    * 
    * @param - none
    * 
    * @return - String rightAns
    */
   public String getAnswer() {
      return this.rightAns;
   } 
   
   //@verride String toString
   /**
    * toString method that helps display multiple choice question.
    * 
    * @param - none
    * 
    * @return - String
    */
   public String toString() {
      StringBuilder str = new StringBuilder();
      str.append(super.toString() + "\n");
      
      for (int i = 0; i < multChoice.size(); i++) {
         str.append("\n" + (char)('A' + i) + ")\t" + multChoice.get(i));
      }
      return str.toString();
   }
}

   