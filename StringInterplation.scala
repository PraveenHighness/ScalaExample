object StringInterplation {
  def main(args: Array[String]): Unit = {
    val name = "PJS"
    val age = 27

    println(name + " is " + age +" Years old ")    //one way to print both values in same with concatination
    println(s"$name is  $age yeas old")  // second way 's'-interpolation
    println(f"$name%s is  $age%d yeas old") // Third way 'f interpolation'  in this case if you want to print age in decimal then type float'$age%f'
    println(s"HI \n PJS")  // in this case 's' is escape with \n to next line even space after \n but
    println(raw"HI \n PJS") // in this case 'raw' is it allow everything what we placed bitween "" quotes

  }

}
