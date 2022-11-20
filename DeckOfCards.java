// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 5/14/2021
public class DeckOfCards
{
    private int numCards;
    private LinkedStack<Card> myDeck;

    public DeckOfCards() {
        myDeck = new LinkedStack<Card>();
        numCards = 0;
    }

    public void fillDeck() {
        int r;
        int s;

        if (!myDeck.isEmpty()) {
            throw new RuntimeException();
        }
        for (r = 0; r < 13; r++) {
            for(s = 0; s < 3; s++) {
                Card newCard = new Card(r, s);
                myDeck.push(newCard);
                
            } 
        }
    }

    public void shuffleDeck() {
        if (myDeck.isEmpty()) {
            throw new RuntimeException();
        }
        for (int i = 1; i < numCards; i++) {
            
            int randInt = 0 + (int)Math.random() * (((numCards -1) - 0) + 1);
            myDeck.swap(i, randInt);
        } 
    }

    public Card drawCard() {
        numCards--;
        return myDeck.pop();
        
    }
    
    @Override
    public  String toString() {
      String retStr = "(Number of Cards left: " + numCards + ") ";
      retStr += "Here's a peek at the deck ";
      retStr += myDeck.toString();
      return retStr; 
    }
    
    public void insertCard(Card myCard) {
        myDeck.push(myCard);
        numCards++;
    }


}