object Fibonacci {

  def fibo(n: Int): Int = {
    if (n < 3) 1
    else fibo(n - 1) + fibo(n - 2)
  }

  def main(args: Array[String]) {
    println("Enter a number : ")
    val a=scala.io.StdIn.readInt()
    for {i <- List.range(1, a+1)}
      yield { print(fibo(i) + ", ")}
  }
}