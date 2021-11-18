import scala.reflect.internal.util.TriState.True

object Vaiables {
  def main(args: Array[String]): Unit = {
    var a : Int = 4  // var is mutable - and this is single line comment with// this

    println(a)
    println(a+10)


    val b: Int = 6 // val == not changeable -it's immutable
    println(b)
    println(b+9)

    // println(b=5) here 'b' value is not able to re assign because 'val' is immutable

    val ps : String = "PJS"    // string
    println(ps)


    var c = True   // boolean
    println(c)

    val d = 4.6  // double
    println(d)

    var e = 1469f //float
    val f = 4.6f
    println(e)
    println(f)


    val x = { val a : Int =69; val b : Int = 19; a+b }
    println(x)

                                                // all these non mentioned variables you can get data type for those you can type of those in cansole like float = ____ and .....?


    lazy val g = 1494
    println(g)  // lazy is asssigning storae space to val variable buut not comlete assiggn as regular if you are doing with tat lazy and then it completly store as permanent  to that variable
    g*8 //  this type of usinf lazy variavles to usase
  }
}
