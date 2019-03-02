import scala.collection.mutable.ListBuffer

object Prueba {
   def main(args: Array[String]): Unit = {
     println("Lista 1: ")
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista1 = solicitarPalabras(readInt()) 
     lista1 = eliminarRepeticiones(lista1)
     
     println("\nLista 2: ")
     println("Ingresa la cantidad de palabras a ingresar: ")
     var lista2 = solicitarPalabras(readInt()) 
     lista2 = eliminarRepeticiones(lista2)
     
     println("Palabras que aparecen en las dos listas: "+pabrasComun(lista1,lista2))
     println("Palabras que aparecen en la primera lista, pero no en la segunda:" + palabrasPrimerLista(lista1, lista2))
     println("Palabras que aparecen en la segunda lista, pero no en la primera:" + palabrasPrimerLista(lista2, lista1))
  }
   
   def palabrasPrimerLista(l1:ListBuffer[String],l2:ListBuffer[String]):ListBuffer[String]={
     var res = ListBuffer.empty[String]
     for(e <- l1){
       if(!l2.contains(e)){
         res.+=(e)
       }
     }
     res
   }
   
   def pabrasComun(l1:ListBuffer[String],l2:ListBuffer[String]):ListBuffer[String]={
     var res = ListBuffer.empty[String]
     for(e1 <- l1){
       for(e2 <- l2){
         if (e1 == e2){
           res.+=(e1)
         }
       }
     }
     res
   }
   
   def eliminarRepeticiones(lista:ListBuffer[String]):ListBuffer[String] = {
     var res = ListBuffer.empty[String]
     lista.foreach(e => if(!res.contains(e)) res.+=(e))
     res
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