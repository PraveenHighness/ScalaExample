object PatternMatch {
  def main(args: Array[String]): Unit = {
    val inputDay = args(0)

    val output = inputDay match {
      case "Monday" => println("Week Day Working Day")
      case "Tuesday" => println("Week Day Working Day")
      case "Wednesday" => println("Week Day Working Day")
      case "Thursday" => println("Week Day Working Day")
      case "Friday" => println("Week Day Working Day")
      case "Saturday" => println("Weekend Not Working Day")
      case "Sunday" => println("Still Weekend")
    }
    println(output)
  }

}
