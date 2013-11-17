class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  def this(n:Int) = this(n, 1)
  
  def + (that: Rational): Rational =
    new Rational (
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def * (that: Rational): Rational = 
    new Rational(numer * that.numer, denom * that.denom)


  override def toString =  numer +"/"+ denom

  def add(that: Rational): Rational =
    new Rational(n * that.denom + that.numer * d, d * that.denom)
  
  def lessThan(that: Rational)  =
    this.numer * that.denom < that.numer * this.denom
  
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
  
  private def gcd(a: Int, b:Int): Int = 
    if (b == 0) a else gcd(b, a % b)
}

