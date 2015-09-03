package example

object Main {
  def main(args: Array[String]): Unit = {
    println(scala.Predef.getClass.getProtectionDomain.getCodeSource)
  }
}