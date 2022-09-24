import scala.annotation.tailrec
// Tail Recursive Implementation for Factorial
@tailrec def factorial(n:Int,r:BigInt =1) : BigInt = {
   if(n<=1) r
   else factorial(n-1,r*n)
}
println(factorial(5)) // prints 120
