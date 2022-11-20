import java.util.*; 
// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 5/14/2021

public class PlayAGame
{
    public static void main(String[] args)
    {
       System.out.println("Shall we play a Game");
       DeckOfCards myDeck = new DeckOfCards();
       DeckOfCards discardDeck = new DeckOfCards();
       int max_cards = 52;
       Card playerHand[] = new Card[max_cards];

       myDeck.fillDeck();
       myDeck.shuffleDeck();

       System.out.print("How many cards should I draw");
       Scanner input = new Scanner(System.in);
       int numPlayerCards = input.nextInt();
       input.close();
       
       System.out.println("Drawing" + numPlayerCards + "cards");
       System.out.println();
       
       System.out.println("My hand:");
       for(int i = 0; i < numPlayerCards; i++)
       {
           playerHand[i] = myDeck.drawCard();
           System.out.println(playerHand[i]);
        }
        System.out.println();
        
        System.out.println("looking at the deck:");
        System.out.println(myDeck.toString());
        System.out.println();

        System.out.println("Returning the cards to the discards pile");
        for (int i = 0; i < numPlayerCards; i++) {
            discardDeck.insertCard(playerHand[i]);
        }
        System.out.println(" Discard pile");
        System.out.println(discardDeck.toString());
        System.out.println();
        System.out.println("Thanks for playing!");




    }
}