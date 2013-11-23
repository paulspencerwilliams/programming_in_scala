var assertionsEnabled = true

def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError

def byNameAssert(predicate: => Boolean) = 
  if (assertionsEnabled && !predicate)
    throw new AssertionError
