
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Card.Suit.SPADES, Card.Face.SIX));
        cards.add(new Card(Card.Suit.CLUBS, Card.Face.FOUR));
        cards.add(new Card(Card.Suit.CLUBS, Card.Face.FIVE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.EIGHT));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
        cards.add(new Card(Card.Suit.CLUBS, Card.Face.THREE));
        cards.add(new Card(Card.Suit.SPADES, Card.Face.SEVEN));

        
        RummyUtils.sort(cards);     
        System.out.println(SwapsRequiredEvaluator.numberofSwaps(cards).size() + " Cards need to be replaced");
        for(Card c: SwapsRequiredEvaluator.numberofSwaps(cards)){
        	System.out.println(c.toString());
        	
//        	List<Card> cards = new ArrayList<>();
//            cards.add(new Card(Card.Suit.SPADES, Card.Face.SIX));
//            cards.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
//            cards.add(new Card(Card.Suit.SPADES, Card.Face.THREE));
//            cards.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
//            List<Card> cards2 = new ArrayList<>();
//            cards2.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
//            cards2.add(new Card(Card.Suit.SPADES, Card.Face.SIX));
//            cards2.add(new Card(Card.Suit.SPADES, Card.Face.SEVEN));
//            cards2.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
//            cards = SequenceGenerationUtil.generateSequenceRetainingCard(cards, 2);
//            System.out.println(RummyUtils.isSequenceOfNCards(cards));
//            System.out.println(RummyUtils.cardsToSwap(cards, cards2));
//            List<Card> cards3 = new ArrayList<>();
//            cards3.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
//            cards3.add(new Card(Card.Suit.SPADES, Card.Face.THREE));
//            cards3.add(new Card(Card.Suit.SPADES, Card.Face.TWO));
//            cards3.add(new Card(Card.Suit.SPADES, Card.Face.FOUR));
//            cards3.add(new Card(Card.Suit.SPADES, Card.Face.FIVE));
//            System.out.println(RummyUtils.cardsToSwapToMakeSequence(cards3));
//            System.out.println(cards);
//            System.out.println(cards2);
//            System.out.println(cards3);
//            List<Card> cards4 = new ArrayList<>();
//            cards4.add(new Card(Card.Suit.SPADES, Card.Face.ACE));
//            cards4.add(new Card(Card.Suit.DIAMONDS, Card.Face.ACE));
//            cards4.add(new Card(Card.Suit.HEARTS, Card.Face.ACE));
//            System.out.println(RummyUtils.cardsToSwapToMakeSet(cards4));
        }

}
}