/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author zerellgardner
 */
//import blackjack.Blackjack;
import java.util.*;
//import java.util.Random;
public class Cards {
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    String[] numbers = new String[]{"A", "2","3","4", "5", "6", "7", "8", "9", "10", "K", "Q", "J"};
    String[] suites = new String[]{"\u2660", "\u2666", "\u2663", "\u2665"};
 
    static int cpuTotal;
    static int playerTotal;
    int total = 0;
    
    public void drawCards(){
    int card1 = rand.nextInt(numbers.length);
    String drawCard1 = numbers[card1]; // put this in a method and do the same for suites and add them together
        if (numbers[card1].equals("K")){
            total += 10;
                }else if (numbers[card1].equals("Q")){
                total += 10;
                    } else if (numbers[card1].equals("J")){
                    total += 10;
                        }else if (numbers[card1].equals("A") && total < 10){
                            total += 11;
                             }else if (numbers[card1].equals("A") && total > 10){
                              total += 1;
                             }
        else { total += Integer.parseInt(numbers[card1]);                             
             }
        
    int card2 = rand.nextInt(numbers.length);
    String drawCard2 = numbers[card2]; // put this in a method and do the same for suites and add them together
        if (numbers[card2].equals("K")){
            total += 10;
                }else if (numbers[card2].equals("Q")){
                total += 10;
                    } else if (numbers[card2].equals("J")){
                    total += 10;
                        }else if (numbers[card2].equals("A") && total < 10){
                            total += 11;
                             }else if (numbers[card2].equals("A") && total > 10){
                              total += 1;
                             }
        else { total += Integer.parseInt(numbers[card2]);                             
             }
        
        
    int randSuite1 = rand.nextInt(suites.length);
    String drawSuite1 = suites[randSuite1];  
    
    System.out.print(drawCard1);
    System.out.println(drawSuite1);  
    
            
    int randSuite2 = rand.nextInt(suites.length);
    String drawSuite2 = suites[randSuite2];  
    
    System.out.print(drawCard2);
    System.out.println(drawSuite2); 
    
    }
    
    public void hit(){
    int card3 = rand.nextInt(numbers.length);
    String drawCard3 = numbers[card3]; // put this in a method and do the same for suites and add them together
        if (numbers[card3].equals("K")){
            total += 10;
                }else if (numbers[card3].equals("Q")){
                total += 10;
                    } else if (numbers[card3].equals("J")){
                    total += 10;
                        }else if (numbers[card3].equals("A") && total < 10){
                            total += 11;
                             }else if (numbers[card3].equals("A") && total > 10){
                              total += 1;
                             }
        else { total += Integer.parseInt(numbers[card3]);                             
             }
        
    int randSuite3 = rand.nextInt(suites.length);
    String drawSuite3 = suites[randSuite3];  
    
    System.out.println(drawCard3);
    System.out.println(drawSuite3); 
    }

    public void cpuHit(){
        total = 0;
        drawCards();
        cpuTotal = total;
        boolean isTrue = true;
            while (cpuTotal <= 15 && isTrue == true){
              hit();
              cpuTotal = total;
            
              if (cpuTotal == 21){
                  System.out.println(cpuTotal + " Dealer has Blackjack, you loose");
                  isTrue = false;
              }
             if (cpuTotal > 21){
                    System.out.println("Dealer busted, you win");
                    isTrue = false;
                }
             // System.out.println("total is: " + cpuTotal); 
            }
        }
    
      public void playerHit(){
        total = 0;
        drawCards();
        playerTotal = total;
    }
      
      
    public void addPlayerCard(){
        total = 0;
        boolean addCard = true;
//        String answer = scan.next();
     //    if(answer.equals("yes")){
        while(addCard){
           System.out.println("Would you like to draw another card?");
           String answer = scan.next();
           String result = answer.toLowerCase();
           if(result.equals("yes")){
            hit();
            playerTotal += total;
            System.out.println("Your total is now " + playerTotal);
            
                if (playerTotal == 21){
                    System.out.println("Blackjack!!");
                    addCard = false;
                }
                
                if(playerTotal > 21){
//                    System.out.println("Total is " + playerTotal + " you loose");
                    addCard = false;
                }
             }else {
               System.out.println("Your total will stay at " + playerTotal);
               addCard = false;
           }
        }
         //System.out.println("Total is " + playerTotal);
                 
    }
  
    public void testHit(){
        
        for (String element : numbers){
        System.out.print(element);
      //  String random = numbers.rand
        }
        
        for (String colors : suites){
            System.out.print(colors);
        }
    }
}
