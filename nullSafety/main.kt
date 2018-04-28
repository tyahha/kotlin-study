fun foo(): String? {
  return null
}


fun main(args: Array<String>) {
  val a = foo()
  if (a != null) {
    println(a.length)
  }
  else {
    println("a is null")
  }
}
