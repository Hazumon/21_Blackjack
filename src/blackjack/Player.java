/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
// update conditional that allows cpu to "hit" if under 15 points
// write code for user hit (preferably a while loop)

/**
 *
 * @author zerellgardner
 */
import java.util.*;
import blackjack.Cards.*;

public class Player {
    
    Cards card = new Cards();
    Scanner sc = new Scanner(System.in);
    
        public void cpu(){
            
            
            card.cpuHit();
            
           // System.out.println("total is: " + card.cpuTotal);
           // System.out.println("cpu bitches");
           // System.out.println("\n");  
        }
        public void user(){
            
            boolean isFalse = true;
            
            while (isFalse == true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Welcome to Blackjack, Would you like to play, please select " + "Yes/No");
                String user = sc.next();
                String question = user.toLowerCase();
                
                if (question.equals("yes")){
                    card.playerHit();
                    System.out.println("total is: " + card.playerTotal); 
                    card.addPlayerCard();
//                    card.addPlayerCard();
                    isFalse = false;
                }
 
                else {
                    System.out.println("We'll thank you and have a nice day");
                    System.out.println(question);
                    isFalse = false;

                }
            }
        }
            // user input
            // conditional if user loses
            // while loop that pauses and waits for user to add card
            // 
//            while (isfalse){
//                
//                
//            }
            
   
        
        public void displayWinner(){
            // display total
            
//            System.out.println("Dealer has " + Cards.cpuTotal + " You have " + Cards.playerTotal);
            
            if(Cards.cpuTotal > Cards.playerTotal && Cards.cpuTotal <= 21){
                System.out.println("Dealer has " + Cards.cpuTotal + " You have " + Cards.playerTotal);
                System.out.println("Dealer wins");
                
            }
            else if(Cards.playerTotal > Cards.cpuTotal && Cards.playerTotal <= 21){
                System.out.println("Dealer has " + Cards.cpuTotal + " and you have " + Cards.playerTotal);
                System.out.println("You win");
            }
        }
        
        // add loop conditional to handle both user and cpu logic
        
    // While loop that incorporates both cpu and user
    // user will go first after initial draw then computer logic will go next
    // end conditional with STAY command that will exit the loop
    
    // initialize computer logic to allow the computer use draw then if their total number is under 14 draw another card
    // initialize user logic in a while loop that once their total is diplayed request if they would like to DRAW or STAY
    
    // display what both play and user have and display the winner
    // winner logic if total is higher then (player) winner will be (player)
    // lose conditional, if card total is higher than 21, (player) looses
}
