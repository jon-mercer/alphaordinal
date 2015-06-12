package co.mercersoft.alphaordinal

import spock.lang.Specification
import spock.lang.Unroll

class AlphaOrdinalComparatorTest extends Specification {

    @Unroll
    def "AlphaOrdinalComparator should return #o1 greater than #o2"(){
        given:
        def comparator = new AlphaOrdinalComparator()

        expect:
        comparator.compare(o1, o2) > 0

        where:
        o1     | o2
        2      | 1010
        1      | 8
        0      | 5
        200    | 500
        8      | null
    }

    @Unroll
    def "AlphaOrdinalComparator should return #o1 less than #o2"(){
        given:
        def comparator = new AlphaOrdinalComparator()

        expect:
        comparator.compare(o1, o2) < 0

        where:
        o1     | o2
        1010   | 2
        8      | 1
        5      | 0
        500    | 200
        null   | 8
    }

    @Unroll
    def "AlphaOrdinalComparator should return #o1 equal to #o2"(){
        given:
        def comparator = new AlphaOrdinalComparator()

        expect:
        comparator.compare(o1, o2) == 0

        where:
        o1     | o2
        1      | 1
        123456 | 123456
        null   | null
    }

    def "AlphaOrderinalComparator should sort the numbers 0-9"() {

        given:
        def numbers = new ArrayList<Integer>()
        numbers.addAll([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])

        when:
        Collections.sort(numbers, new AlphaOrdinalComparator())

        then:
        numbers == [8, 5, 4, 9, 1, 7, 6, 3, 2, 0]
    }
}
