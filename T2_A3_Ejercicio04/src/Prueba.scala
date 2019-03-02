import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
     println("Lista 1: ")
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista1 = solicitarPalabras(readInt()) 
     
     println("\nLista 2: ")
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista2 = solicitarPalabras(readInt()) 
     
     lista1 = eliminarPalabras(lista1, lista2)
     
     println("\nPalabras eliminadas lista 1; ")
     println(lista1)
  }
  
  def eliminarPalabras(l1:ListBuffer[String], l2:ListBuffer[String]):ListBuffer[String] ={
    var l3 = l1
    l2.foreach(e => l3 = l3.filter(p => p != e))
    l3
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