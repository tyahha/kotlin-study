fun main(args: Array<String>) {
  val ret = listOf(1,2,3).map {it * it}
  for (i in ret) {
    println(i)
  }
}
