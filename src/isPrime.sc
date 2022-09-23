 import scala.annotation.tailrec
  // Tail Recursive Implementation of Prime Number check in Scala
  def CheckPrime(n:Int): Boolean ={
    @tailrec def isPrime(n:Int,d:Int):Boolean={
      if (d * d > n) return true
      else if (n % d == 0 && n!=d && d!=1) return false
      isPrime(n, d + 1)
    }
    if(n==1) false
    else isPrime(n,1)
   }
    println(CheckPrime(7800)) // prints false
    println(CheckPrime(7919)) // prints true
