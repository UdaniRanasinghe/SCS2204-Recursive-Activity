object GetSum extends App{

  def sum(i :Int) : Int = {
        if(i==0)
          return s
        else{
          s+=i;
          return sum(i-1)
        }
  }
  println("Enter a number : ")
  val n=scala.io.StdIn.readInt()
  var s = 0;
  println(sum(n))
}