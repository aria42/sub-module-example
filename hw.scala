import org.allenai.common.Timing

object Hi {
  def main(args: Array[String]): Unit = {
    val time = Timing.time(Thread.sleep(100))
    println(s"Time took $time")
  }
}
