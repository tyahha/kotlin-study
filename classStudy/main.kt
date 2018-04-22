class Person {
  val firstName: String
  val lastName: String

  constructor(firstName: String, lastName: String) {
    this.firstName = firstName
    this.lastName = lastName
  }

  fun getName(): String {
    return firstName + " " + lastName
  }
}

fun main(args: Array<String>) {
  val (firstName, lastName) = if (args.size > 1) {
    Pair(args[0], args[1])
  }
  else if (args.size > 0) {
    Pair(args[0], "defaultLastName")
  }
  else {
    Pair("defaultFirstName", "defaultLastName")
  }

  val p = Person(firstName, lastName)

  println(p.getName())
}
    
