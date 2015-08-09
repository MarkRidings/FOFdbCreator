import scala.collection.mutable.ListBuffer
import scala.io.Source._

object FileReader {

  def GetFile(fileName: String): List[Array[String]] = {

    val file = fromFile(fileName)
    var lines = new ListBuffer[Array[String]]()

    for (line <- file.getLines()) {
      val cols = line.split(",")
      lines += cols
    }

    file.close()

    lines.toList
  }
}
