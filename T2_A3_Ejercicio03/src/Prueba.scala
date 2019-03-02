import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista = solicitarPalabras(readInt()) 
     
     println("Ingresa la palabra a eliminar: ")
     var p = readLine()
    
    lista = eliminarPalabra(p, lista)
    
    println("Palabra eliminada")
    println(lista)
  }
  
  def eliminarPalabra(p:String, lista:ListBuffer[String]):ListBuffer[String] ={
    lista.-=(p)
  }
  
  def solicitarPalabras(numoPal:Int):ListBuffer[String] = {
    val palabras = ListBuffer.empty[String]
    for (i <- 0 until numoPal){
      println("Ingresa la palabra "+ (i+1))
      palabras.+=(readLine())
    }
    palabras
  }
}