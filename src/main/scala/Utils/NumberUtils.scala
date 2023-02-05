package Utils

object NumberUtils {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) return false
    for (i <- 2 to Math.sqrt(n).toInt) {
      if (n % i == 0) return false
    }
    true
  }

  def createSmallestNumber(a: Int, b: Int, c: Int): Int = {
    var digits = List(a, b, c).sorted

    if (digits.head == 0) {
      digits = digits.updated(0, digits(1)).updated(1, digits.head)
    }

    100 * digits.head + 10 * digits(1) + digits(2)
  }
}