object Ehpar{
	def main(args: Array[String]) = {
		val lista = List(1,2,3,4,5,6,7,8,9)
		val listaPares = lista.filter(x=>ehPar(x))
		println(s"Lista total : $lista")
		println(s"Lista só com pares : $listaPares")
	}
	
	def ehPar(x:Int):Boolean = x % 2 == 0

}