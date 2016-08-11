import java.util.ArrayList;
import java.util.List;

public class SequenceGenerationUtil {

    private static final int WRAP_VALUE_OF_TWO = 15;
    private static final int FACE_VALUE_OF_TWO = 2;

    public static List<Card> generateSequence(Card startingCard, int length) {
        Card previousCard = startingCard;
        List<Card> cards = new ArrayList<> ();
        cards.add(startingCard);
        for (int i = 0; i < length-1 ; i++) {
            int faceValueToAdd = previousCard.getFaceValue() + 1;
            if (faceValueToAdd == WRAP_VALUE_OF_TWO) {
                faceValueToAdd = FACE_VALUE_OF_TWO;
            }
            Card card = new Card(previousCard.getSuit(), faceValueToAdd);
            cards.add(card);
            previousCard = card;
        }
        if (isWrappedSequence(cards)) {
            return new ArrayList<>();
        }
        return cards;
    }

    private static Boolean isWrappedSequence(List<Card> cards) {
        return isFirstCardJackOrBigger(cards) &&
                isFirstCardNotAce(cards) &&
                isLastCardTwoOrHigher(cards);
    }

    private static Boolean isFirstCardJackOrBigger(List<Card> cards) {
        return (cards.get(0).getFaceValue() >= 11);
    }

    private static Boolean isFirstCardNotAce(List<Card> cards) {
        return (cards.get(0).getFaceValue() != 14);
    }

    private static Boolean isLastCardTwoOrHigher(List<Card> cards) {
        return (cards.get(cards.size() - 1).getFaceValue() >= 2);
    }

    public static List<Card> generateSequenceRetainingCard(List<Card> cards, int indexToRetain) {
        Card cardToRetain = cards.get(indexToRetain);
        int length = cards.size();
        int faceValueOfFirstCard = cardToRetain.getFaceValue() - indexToRetain;
        if (faceValueOfFirstCard == 1) {
            faceValueOfFirstCard = 14;
        }
        else if (faceValueOfFirstCard == 0) {
            faceValueOfFirstCard = 13;
        }
        Card firstCard = new Card(cardToRetain.getSuit(), faceValueOfFirstCard);
        return generateSequence(firstCard, length);
    }
}
