class Person(val firstName: String, val lastName: String) {
  val name: String
    get() = firstName + " " + lastName
}

fun main(args: Array<String>) {
  val (firstName, lastName) = if (args.size > 1) {
    Pair(args[0], args[1])
  }
  else if (args.size > 0) {
    Pair(args[0], "default lastName")
  }
  else {
    Pair("default firstName", "default lastName")
  }

  val p = Person(firstName, lastName)

  println(p.name)
}
