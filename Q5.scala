object GetEvenSum extends App{

  def sum(i :Int) : Int = {
        if(i==0)
          return s
        else{
          s+=i;
          return sum(i-2)
        }
  }
  println("Enter a number : ")
  val n=scala.io.StdIn.readInt()
  var s = 0;
  if(n%2==1)
    println(sum(n-1))
  else
    println(sum(n))
}