class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  var denom: Int = d
  override def toString = n +"/"+ d

  def add(that: Rational): Rational =
    new Rational(n * that.denom + that.numer * d, d * that.denom)
}

