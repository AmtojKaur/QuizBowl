/* 
 * TCSS 143 - Autumn 2021
 * Instructor: Raghavi Sakhpal
 * Question Class for QuizBowl
 */
 
import java.util.*;
import java.io.*;

/**
 * Abstract class keeps track of information common to all three 
 * types of questions. All questions will have a String that stores
 * the question as well as a point value.
 *
 * @author Amtoj Kaur amtojk@uw.edu
 * @version November 05, 2021
 */
public abstract class Question {
   
   //instance feilds
   private String question;
   private int point;
   
   /**
    * Question Cosntructor Method - takes two parameter, a String
    * question that is the question and an Integer point that is the
    * number of points a question is worth
    * 
    * @param question - is the question that will be asked
    * @param points - points a question is worth
    * 
    * @return - void
    */
   public Question(String question, int point) {
      this.question = question;
      this.point = point;
   }
   
    /**
    * Get method for question helps access private feild question
    * 
    * @param - none
    * 
    * @return - String question
    */
    public String getQuestion() {
      return this.question;
   }
   
    /**
    * Get method for points helps access private feild point
    * 
    * @param - none
    * 
    * @return - int point
    */
   public int getPoints() {
      return this.point;
   }
   
   //@verride String toString
   /**
    * toString method that helps display the points a question is
    * worth as well as the question itself.
    * 
    * @param - none
    * 
    * @return - String
    */
   public String toString() {
      return ("Points: " + getPoints() + "\nQuestion: " + getQuestion());
   }
   
   /**
    * Abstract method for correct answers
    * 
    * @param - none
    * 
    * @return - none
    */
   abstract public String getAnswer();
   
}