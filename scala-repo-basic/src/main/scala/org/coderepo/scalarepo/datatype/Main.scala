package org.coderepo.scalarepo.datatype

object Main {
  def main(args: Array[String]): Unit = {
//    demoValue()
//    demoValue()
//    demoNaming()
//    demoType()
    demoString()
  }

  // 值
  def demoValue(): Unit = {
    // 定义值格式 val <identifier>: [<type>] = <data>
    val x: Int = 5
    println(x)
    println(x*2)
    println(x/5)
    // 定义值时类型可以自动推导
    val y = 20
    val greeting= "hello, world"
    println(y)
    println(greeting)
  }

  // 变量
  def demoVariable(): Unit = {
    // 定义变量格式 var <identifier>[:<type>] = <data>
    var xx = 5
    xx += 10
    println(xx)
  }

  // 命名
  // 相比于C/C++/JAVA等语言，Scala语言可以是用特殊的符号来命名
  def demoNaming(): Unit = {
    val $ = "USD currency symbol"
    println($)
    val _0 = 10086
    println(_0)
  }

  // 类型
  // 核心数值类型
  // 类型名        描述            大小
  // Byte         有符号整数       1字节
  // Short        有符号整数       2字节
  // Int          有符号整数       4字节
  // Long         有符号整数       8字节
  // Float        有符号浮点数     4字节
  // Double       有符号浮点数     8字节
  def demoType(): Unit = {
    val a: Long = 20
    val b: Int = a.toInt // 类型向下转换
    println(a)
    println(b)
  }

  // 字符串
  def demoString(): Unit = {
    val hello: String = "Hello there"
    println(hello)
    val b: String = "Hello" + " there"
    println(b == hello) // 注意与JAVA的区别，Scala中"=="会检查字符串真正的相等性。
  }
}
