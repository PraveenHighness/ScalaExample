object ifelse {
  def main(args: Array[String]): Unit = {
    val a = 20
    val result = ""

    if(a == 20) {
        println("True")
      }
    else
      println("False")


    /*if(a == 20) {
      result = "a == 20"
    }
    else{
      result = "a != 20"
    }
    println(result)*/

    val result2 = if (a == 20) "a == 20   / true " else "a !=20  /  False"

    println(result2)
  }

}
