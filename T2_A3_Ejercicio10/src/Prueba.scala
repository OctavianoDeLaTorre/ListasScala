import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var valores = solicitarNumeros(readInt()) 
    
    println("Valores repetidos (par: (valor, cantidad de repeticiones)): ")
    println(empaquetar(valores))
    
  }
  
  def empaquetar(valores:ListBuffer[Int]):ListBuffer[List[Int]]={
    val res = ListBuffer.empty[List[Int]]
    val valAunx = eliminarRepeticiones(valores)
    for(n <- valAunx){
      val repeticiones = numRepeticiones(n, valores)
      if(repeticiones > 1)
        res.+=(List(n,repeticiones))
    }
    res
  }
  
  def eliminarRepeticiones(valores:ListBuffer[Int]):ListBuffer[Int] = {
     var res = ListBuffer.empty[Int]
     valores.foreach(e => if(!res.contains(e)) res.+=(e))
     res
   }
  
  def numRepeticiones(n:Int,valores:ListBuffer[Int]):Int = {
    var res = 0
    for(e <- valores){
      if(e == n){
        res += 1
      }
    }
    res
  }
  
  
   def solicitarNumeros(numoPal:Int):ListBuffer[Int] = {
    val numeros = ListBuffer.empty[Int]
    for (i <- 0 until numoPal){
      println("Ingresa el numero "+ (i+1))
      numeros.+=(readInt())
    }
    numeros
  }
}