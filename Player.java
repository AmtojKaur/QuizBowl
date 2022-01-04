/* 
 * TCSS 143 - Autumn 2021
 * Instructor: Raghavi Sakhpal
 * Player Class for QuizBowl
 */
 
import java.util.*;
import java.io.*;

/**
 * A standalone object class that keeps track of the user playing the
 * game. This class should store the first and the last name of the 
 * player, as well as the number of points the player has. The player
 * initially starts with 0 points. 
 *
 * @author Amtoj Kaur amtojk@uw.edu
 * @version November 05, 2021
 */
public class Player{
   
   //instance feilds 
   private String firstName;
   private String lastName;
   private int score = 0;
   
   /**
    * Player Cosntructor Method - Receives two string parameters
    * first name and last name of the player from the driver.
    * 
    * @param firstName - gives Player's first name
    * @param lastName - gives Player's last name
    * 
    * @return - void
    */
   public Player(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   /**
    * Get method for first name helps access private feild firstName
    * 
    * @param - none
    * 
    * @return - String first name
    */
   public String getFirstName() {
      return this.firstName;
   }
   
   /**
    * Get method for last name helps access private feild lastName
    * 
    * @param - none
    * 
    * @return - String last name
    */
   public String getLastName() {
      return this.lastName;
   }
   
   /**
    * Get method for score helps access private feild score
    * 
    * @param - none
    * 
    * @return - int player score
    */
   public int getPlayerScore() {
      return this.score;
   }
   
   /**
    * Set method for score helps modify private feild score
    * 
    * @param - the value for score
    * 
    * @return - void
    */
   public void updatePlayerScore(int score) {
      this.score = score + this.score;
   }
   
   //@verride String toString
   /**
    * toString method that helps display Player name and score.
    * 
    * @param - none
    * 
    * @return - String
    */
   public String toString() {
      return (getFirstName() + getLastName() + ", your game is over" +
               "\nYour final score is " + score + " points. \n" +
               "Better luck next time!");
   }
}

