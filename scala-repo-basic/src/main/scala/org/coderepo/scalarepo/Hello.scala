package org.coderepo.scalarepo

// Object声明引入了单例对象的概念，该声明在定义了
// 一个Hello类的同时，还声明了该类的一个实例，实例的名字
// 也叫Hello。该实例在第一次被用到的时候被创建。
object Hello {
  def main(args: Array[String]): Unit = {
    println("hello world")
  }
  def printHello() : Unit = {
    println("hello!")
  }
}
