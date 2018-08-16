

object classone {
  def main(args: Array[String]): Unit = {

    println("kdhfslkfhlkjfsl")
    val list = List(1, 2, 3, 4, 5, 6, 11, 9, 99)
    println(m1(list))
    println(m2(list) +"ola")

  }

  def m1(l: List[Int]): Int = {

    l.max
  }

  def m2(l: List[Int]): List[Int] = l match {
    case Nil                 => l
    case p :: tail if (p < 10 )=> p :: m2(tail)
    case p :: tail           => m2(tail)
    case p :: Nil            => l

  }

}


