public class Card {
    private String cardName;
    private String cardText;
    private String cardTextAlt;
    private boolean hasAlt;

    public Card(String cardName, String cardText){
        this.cardName = cardName;
        this.cardText = cardText;
        this.hasAlt = false;
    }

    public Card(String cardName, String cardText, String cardTextAlt){
        this.cardName = cardName;
        this.cardText = cardText;
        this.cardTextAlt = cardTextAlt;
        this.hasAlt = true;
    }

    public String getCardText(){
        return cardText;
    }

    public String getCardTextAlt(){
        return cardTextAlt;
    }

    public boolean hasAlt(){
        return hasAlt;
    }
}
