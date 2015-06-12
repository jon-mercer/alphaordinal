package co.mercersoft.alphaordinal;

import java.util.Comparator;

public class AlphaOrdinalComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        NumberToWord numberToWord = new NumberToWord();
        String word1 = numberToWord.convert(o1);
        String word2 = numberToWord.convert(o2);

        return word1.compareTo(word2);
    }
}
