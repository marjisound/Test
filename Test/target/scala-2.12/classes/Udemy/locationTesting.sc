def greeting(name:String, age: Int) : String = {
  s"Hi my name is $name and I am $age ${if (age > 1) "years" else "year"} old"
}

println(greeting("Marjan", 36))

def myFactorial(n: Int): Int = {
  def helper(n: Int, accumulator: Int): Int = {
    if (n == 1) accumulator
    else helper(n-1, accumulator*n)
  }

  helper(n, 1)
}

println(myFactorial(3))

def myFibo(n: Int): Int = {

  def helper(n: Int, accu1: Int, accu2: Int): Int = {
    if (n <= 2) accu1 + accu2
    else helper(n - 1, accu2, accu1 + accu2)
  }

  helper(n, 0, 1)
}

myFibo(7)

def isPrime(n: Int): Boolean = {
  def isPrimeHelper(num: Int, m: Int): Boolean = {
    if (m <= 1) true
    else if (num%m == 0) false
    else isPrimeHelper(num, m-1)
  }

  isPrimeHelper(n, n/2)
}

isPrime(7)

def stringConcat(str: String, n: Int) : String = {
  def helper(m: Int, accu: String) : String = {
    if (m == 0) accu
    else helper(m-1, accu + str)
  }
  helper(n - 1, str)
}

stringConcat("Marjan", 3)

val speed = 1.2f
val myString = f"hey $speed%100.1f"


