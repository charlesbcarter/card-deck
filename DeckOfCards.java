public class DeckOfCards {
    Card[] deckOfCards;
    public DeckOfCards(){
        Card[] deckOfCards = new Card[52];
        int count = 0;
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++ ){
            for(int rank = 1; rank <= 13; rank++){
                deckOfCards[count++] = new Card(suit, rank);
            }
        }
    }
    public String toString(){
        StringBuilder s1 = new StringBuilder();
        int count = 0;
        for(int i = 0; i < 4; i++) {
            for (int k = 1; k <= 13; k++){
                s1.append(deckOfCards[count++]);
            }
            s1.append("/n");
        }

        return s1.toString();
    }

    private class Card{
    private static final int CLUBS = 1; private static final int DIAMONDS = 2; private static final int HEARTS = 3; private static final int SPADES = 4;
    private int suit;
    private int rank;
    private Card(int suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }
    }
}
