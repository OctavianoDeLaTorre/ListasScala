import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de palabras a ingresar: ")
    var palabras = solicitarPalabras(readInt()) 
    println("\nPalindromas:")
    println(obtenerPalindromas(palabras))
    
  }
  
  def obtenerPalindromas(palabras:ListBuffer[String]):ListBuffer[String] ={
    val res = ListBuffer.empty[String]
    for(p <- palabras){
      if(esPalindroma(p)){
        res.+=(p)
      }
    }
    res
  }
  
  def esPalindroma(p:String):Boolean = {
    var tam = p.length()-1
    for(i <- 0 until p.length()){
        if(p.charAt(i) != p.charAt(tam-i)){
         return false
        }
    }
    true
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