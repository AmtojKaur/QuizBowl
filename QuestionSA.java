/* 
 * TCSS 143 - Autumn 2021
 * Instructor: Raghavi Sakhpal
 * QuestionSA Class for QuizBowl
 */
 
import java.util.*;
import java.io.*;

/**
 * Object class that keeps track of the information regarding true/
 * false questions extends abstract Question
 *
 * @author Amtoj Kaur amtojk@uw.edu
 * @version November 05, 2021
 */
public class QuestionSA extends Question{
   
   //Instance feild 
   private String rightAns;
   
   /**
    * QuestionSA Cosntructor Method - takes three parameters String
    * name for the question, int point for what the question is worth
    * and String answer for the correct answer
    * 
    * @param name - is the question that will be asked
    * @param points - points a question is worth
    * @param rightAns - stores right answer
    * 
    * @return - void
    */
   public QuestionSA(String name, int point, String rightAns) {
      super(name, point);
      this.rightAns = rightAns;
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
}