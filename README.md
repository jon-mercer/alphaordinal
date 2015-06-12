# alphaordinal
A very silly technique for comparing numbers.

## What is alphaordinal?
Alphaordinal implements a method of comparing two numbers; not by their numerical values of course, but by the alphabetical order of how they are spelled.

Here's an example of the numbers 0-9 sorted in alphaordinal order.

* 8 (eight)
* 5 (five)
* 4 (four)
* 9 (nine)
* 1 (one)
* 7 (seven)
* 6 (six)
* 3 (three)
* 2 (two)
* 0 (zero)

## What practical uses does this thing have?
None

## How do I use it anyway?
You can utilize `AlphaOrdinalComparator` which implements `Comparator<Integer>`.  For example, this is an excerpt from the unit tests of this project (it's in groovy, but is easily mappable to Java)

```groovy
def "AlphaOrderinalComparator should sort the numbers 0-9"() {
  given:
  def numbers = new ArrayList<Integer>()
  numbers.addAll([0, 1, 2, 3, 4, 5, 6, 7, 8, 9])

  when:
  Collections.sort(numbers, new AlphaOrdinalComparator())

  then:
  numbers == [8, 5, 4, 9, 1, 7, 6, 3, 2, 0]
}
```
