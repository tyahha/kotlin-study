interface Animal {
  fun bark()
}

class Cat: Animal {
  override fun bark() = println("nya-")
  fun catMethod() = println("I'm cat")
}

class Dog: Animal {
  override fun bark() = println("wanwan")
  fun dogMethod() = println("I'm dog")
}

fun getAnimal(args: Array<String>): Animal {
  if (args.size > 0) {
    return Cat()
  }
  else {
    return Dog()
  }
}


fun main(args: Array<String>) {
  val animal = getAnimal(args)
  animal.bark()

  if (animal is Cat) {
    animal.catMethod()
  }
  if (animal is Dog) {
    animal.dogMethod()
  }
}
