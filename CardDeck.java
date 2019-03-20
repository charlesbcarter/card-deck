public class CardDeck {
    Card[] deck = new Card[52];
    CardDeck() {
        int count = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for(int rank = 1; rank <= 13; rank++){
                deck[count]=new Card(suit,rank);
                count++;
            }
        }
    }
    public void shuffleDeck(){
        int i,j;
        for (int n = 0; n < 52; n++) {
            i = (int) (52 * Math.random());
            j = (int) (52 * Math.random());

            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }
    public String toString(){
        String s = "";
        for(int i = 0; i <52; i++){
                s += deck[i].toString() + ", ";
        }
        return s;
    }
    public static class Card{
        private int suit;
        private int rank;
        public static final  String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        public static final String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        public Card(int suit, int rank){
            this.suit = suit;
            this.rank = rank;
        }

        public String toString() {
            String s = ranks[this.rank] + " of " + suits[this.suit];
            return s;
        }
    }
}
