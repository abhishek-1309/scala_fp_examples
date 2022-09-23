  import scala.annotation.tailrec
  // Tail Recursive Implementation of Prime Number check in Scala
  @tailrec def isPrime(n:Int,d:Int): Boolean ={
      if(d*d>n) return true
      else if(n%d==0) return false
      isPrime(n,d+1)
   }
  println(isPrime(70,2)) // prints false
  println(isPrime(7919,2)) // prints true
