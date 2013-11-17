class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  var denom: Int = d

  def this(n:Int) = this(n, 1)
  override def toString = n +"/"+ d

  def add(that: Rational): Rational =
    new Rational(n * that.denom + that.numer * d, d * that.denom)
  
  def lessThan(that: Rational)  =
    this.numer * that.denom < that.numer * this.denom
  
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
}

