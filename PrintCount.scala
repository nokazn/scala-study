object PrintCount extends App {
  def printCount(n: Int): Unit = {
    println(n);
    printCount(n + 1);
  }
  printCount(0);
}
