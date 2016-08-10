import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
        cards.add(new Card(Card.Suit.HEARTS, Card.Face.ACE));
        cards.add(new Card(Card.Suit.DIAMONDS, Card.Face.ACE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Face.ACE));
        System.out.println(RummyUtils.isSetOfNCards(cards, 4));
    }
}
