package Udemy

object Generics extends App {
  // generic class
  class MyList[A]{

  }

  val list1 = new MyList[Int]
  val list2 = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyList = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal


}
