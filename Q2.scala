object Primes {

  def main(args: Array[String])={
        primeseq(20);
  }
  def isprime(n:Int,i:Int=2): Boolean ={

    if(n <= 2) return if (n==2) true else false;
    if(n % i == 0) return false;
    if(i*i >n) return true;

    isprime(n,i+1);
  }

  def primeseq(j:Int):Unit={
    if(j>0){
      primeseq(j-1)
    }
    if (isprime(j)) println(j);
  }



}
