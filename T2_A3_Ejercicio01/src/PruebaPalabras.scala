import scala.collection.mutable.ListBuffer


object PruebaPalabras {
  def main(args: Array[String]): Unit = {
    
     println("Ingresa la cantidad de palabras a ingresar: ")
     var palabras = solicitarPalabras(readInt()) 
     println("Ingreasa la palabra a buscar:")
     println("Número de apariciones: "+cantidadApariciones(readLine(), palabras))
     
    
  }
  
  def cantidadApariciones(palabra:String, lista:ListBuffer[String]): Int ={
    var apariciones = 0
    lista.foreach(p => if (p ==palabra ) apariciones += 1)
    apariciones
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




