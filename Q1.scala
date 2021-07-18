object CheckPrime extends App{
  def prime(i :Int) : Boolean = {
        if (i <= 1)
           false
        else if (i == 2)
            true
        else
          !(2 to (i-1)).exists(x => i % x == 0)
  }
  println("Enter the number you want to find : ")
  val n=scala.io.StdIn.readInt()
  println(prime(n))
}