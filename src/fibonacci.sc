import scala.annotation.tailrec
  // Tail Recursive Implementation of Fibonacci Sequence in Scala
  def calculate_fibonacci(a:Long,b:Long,n:Int):Long={
     @tailrec def fibonacci(a:Long, b:Long, n:Int): Long ={
      if(n==0) b
      else fibonacci(b,b+a,n-1)
    }
    if (n==1) a
    else if (n==2) b
    else fibonacci(a,b,n-2)
  }
  // n -> nth term of the sequence
  println(calculate_fibonacci(1,1,30)) // prints 832040 
