object WhileLoop {
  def main(args: Array[String]): Unit = {
    var a = 0

    while (a <= 10){
      println(" a ="+a)
      a += 1   // a = a+1.....
    }
    println(" ")

    var b = 0
    do {
      println(" b = " + b)
      b += 1

    }while(b < 14)
  }

}
