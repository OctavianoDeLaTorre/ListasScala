import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var numeros = solicitarNumeros(readInt()) 
    
    println("\nSumaorias: ")
    println(obtenerSumatoria(numeros))
    
  }
  
  def obtenerSumatoria(numeros:ListBuffer[Int]):ListBuffer[Int] ={
    val res = ListBuffer.empty[Int]
    var sumatoria = 0
    for(n <- numeros){
      sumatoria += n
      res.+=(sumatoria)
    }
    res
  }
  
   def solicitarNumeros(numoPal:Int):ListBuffer[Int] = {
    val num = ListBuffer.empty[Int]
    for (i <- 0 until numoPal){
      println("Ingresa la palabra "+ (i+1))
      num.+=(readInt())
    }
    num
  }
}