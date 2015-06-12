package co.mercersoft.alphaordinal

import spock.lang.Specification
import spock.lang.Unroll

class NumberToWordTest extends Specification {

    @Unroll
    def "should convert #number to #word"() {
        given:
        def numberToWord = new NumberToWord()

        expect:
        numberToWord.convert(number) == word

        where:
        number | word
        0         | "zero"
        1         | "one"
        2         | "two"
        3         | "three"
        4         | "four"
        5         | "five"
        6         | "six"
        7         | "seven"
        8         | "eight"
        9         | "nine"
        10        | "ten"
        11        | "eleven"
        12        | "twelve"
        13        | "thirteen"
        14        | "fourteen"
        15        | "fifteen"
        16        | "sixteen"
        17        | "seventeen"
        18        | "eighteen"
        19        | "nineteen"
        20        | "twenty"
        21        | "twenty one"
        123456789 | "one hundred twenty three million four hundred fifty six thousand seven hundred eighty nine"
    }
}
