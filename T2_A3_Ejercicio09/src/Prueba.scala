import scala.collection.mutable.ListBuffer

object Prueba {
  def main(args: Array[String]): Unit = {
    println("Ingresa la cantidad de números a ingresar: ")
    var numeros = solicitarNumeros(readInt()) 
    
    println("Numeros primos:")
    println(obtenerPrimos(numeros))
    println("Sumatoria y promedio:")
    println(obtenerSumProm(numeros))
    println("Factoriales:")
    println(obtenerFactoriales(numeros))
  }
  
   def obtenerPrimos(numeros:ListBuffer[Int]):ListBuffer[Int] ={
     val res = ListBuffer.empty[Int]
     numeros.foreach(n => if(esPrimo(n)) res.+=(n))
     res
  }
 
   def esPrimo(n:Int):Boolean={
     for(i <- 1 to n){
       if(n%i == 0 && i != 1 && n != i)
         return false
     }
     true
   }
  
  def obtenerSumProm(numeros:ListBuffer[Int]):ListBuffer[Double] ={
     val res = ListBuffer.empty[Double]
     var sum = 0
     for(n <- numeros)
       sum += n
  
     res.+=(sum)
     res.+=(sum/numeros.size)
     return res
  }
  
  def obtenerFactoriales(numeros:ListBuffer[Int]):ListBuffer[Int] ={
    val res = ListBuffer.empty[Int]
    for(e <- numeros){
      res.+=(factorial(e))
    }
    res
  }
  
   def factorial(num:Int): Int = {
    if(num == 0){
      1
    } else {
      factorial(num-1)*num 
    }
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