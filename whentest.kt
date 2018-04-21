fun main(args: Array<String>) {
  val msg = if (args.size > 0) {
    when(args[0]) {
      "a" -> "arg1 = 1"
      "b", "c" -> "arg1 = b or c"
      else -> "default"
    }
  } else {
    "argment is not specified" 
  }
  println(msg)
}
