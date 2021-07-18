object Primes extends App{

	def GCD(i:Int, j:Int):=j match {
		case 0=>0
		case n if n>a => GCD(n,a)
		case_ => GCD(i,i%j)
	}
	
	def prime(m:Int, n:Int=2):Boolean =n match{
		case x if(m==x)=>true
		case x if (GCD(m,x)>1)=>false
		case x => prime(m,x+1)
	}

println("Enter a number : ")
val a=scala.io.StdIn.readInt()
println(prime(a))
}
