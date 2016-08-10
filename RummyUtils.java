import java.util.*;

public class RummyUtils {

    public static Boolean isSetOfNCards(List<Card> cards, int n) {
        Boolean isSetOfNCards = true;
        if (cards.size() == n) {
            int faceValue = cards.get(0).getFaceValue();
            Set<Card.Suit> suitsFound = new HashSet<>();
            for (Card card : cards) {
                if (!(card.isJoker())) {
                    if (card.getFaceValue() != faceValue) {
                        isSetOfNCards = false;
                    }
                    if (suitsFound.contains(card.getSuit())) {
                        isSetOfNCards = false;
                    } else {
                        suitsFound.add(card.getSuit());
                    }
                }
            }
        }
        else {
            isSetOfNCards = false;
        }
        return isSetOfNCards;
    }

    public static Boolean isSequenceOfNCards(List<Card> cards, int n) {
        Boolean isSequenceOfNCards = true;
        if (cards.size() == n) {
            sort(cards);
            //TODO: write logic here.
        }
        else {
            isSequenceOfNCards = false;
        }
        return isSequenceOfNCards;
    }

    public static void sort(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getFaceValue() - o2.getFaceValue();
            }
        });
    }
}
