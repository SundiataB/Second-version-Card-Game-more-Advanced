// Author Sundiata Bondojia
// Program : Sorting Array 
// Date 2/16/2021
// Date Modified 5/14/2021
//This is the card class that contains the all the information needed for the War Game 
public class Card implements Comparable<Card> {
    private int rank;
    private int suit;
    private int minRank = 1;
    private int maxRank = 13;
    private int minSuit = 0;
    private int maxSuit = 3;
    //The card function contains the rank and suit needed for the cards to  be intilialized to zero. This allpw
    public Card() {
        rank = 1;
        suit = 0;
    }
    public Card(int rank, int suit)
    {
        if (rank >= 1 && rank <= 13 && suit >= 0 && suit <= 3) {
            this.rank = rank;
            this.suit = suit;
        }
        else {
            rank = 0;
            suit = 0;
        }
    }

    public void setRank(int r) {
       if (r <= minRank && maxRank <= r) {
           rank = r;
       } 
    }
    public void  setSuit(int s) {
        if (s <= minSuit && maxSuit <= s) {
            suit = s;
        }
    }
    
    //The drawCard function is contains the random number generater needed generate the rank and suit based on the parameters between the numbers
    public void drawCard() {
        suit = 0 + (int) (Math.random() * ((3 - 0) +  1));
        rank = 1 + (int) (Math.random() * ((13 - 1) + 1));
    }

    //This is a accessor function used in the class to return the rank when needed in the main class
    public int getRank() {
        return rank;
    }
    
    //This function contains the arrays of CARDTYPE and CARDUM along with using the  rank and suit to grab the certian elements
    @Override
    public  String toString() {
        final String[] CARDTYPE = { "Spades", "Hearts", "Diamonds", "Clubs" };
        final String[] CARDNUM = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        return String.format(CARDNUM[rank] + " of " + CARDTYPE[suit]);
    }
    
    //This function is using a true or false statement for the cards and is using 'that' as an object for getranks.
    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;    // object is compared with itself
        if (!(that instanceof Card))
            return false;   // objects are not the same type
        if (((Card)that).getRank() == getRank())
            return true;    // actual data test
        return false;
    }
    
    //This function main purpose is to compare the rank between each other, while comparing cards 
    @Override
    public int compareTo(Card that)
    {
        return Integer.compare(getRank(), that.getRank());
    }
};