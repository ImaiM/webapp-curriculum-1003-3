object Euclid extends App {

  def greatestCommonDivisor(a: Int, b: Int): Int = {
      val r = a % b
    if (r > 0) {
      greatestCommonDivisor(b, r)
    } else {
      return b
  }
}
}
