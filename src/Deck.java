import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private Random r;

    public Deck(ArrayList<Card> cards){
        this.cards = cards;
        r = new Random();
    }

    public Card drawCard(){
        int choice = r.nextInt(cards.size());
        Card chosenCard = cards.get(choice);
        cards.remove(choice);
        return chosenCard;
    }

    public void addCard(Card card){
        cards.add(card);
    }
}
