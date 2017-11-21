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
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Cards card = new Cards();
        Player play = new Player();
//        System.out.println(card.suites);
//        System.out.println(card.numbers);
//        play.cpu();
        play.user();
        play.cpu();
        play.displayWinner();

     // card.hit();
     //   System.out.println(Cards.total);

    }
    
}
