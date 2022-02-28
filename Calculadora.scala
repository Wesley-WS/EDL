object Calculadora{
	def soma(x: Int, y: Int): Int = x + y
	
	def sub(x: Int, y: Int): Int = x - y
	
	def multi(x: Int, y: Int): Int = x * y
	
	def div(x: Int, y: Int): Int = x / y
	
	def main(args: Array[String]) = {
		var resultado = soma(30,10)
		println(s"A soma de 30 + 10 : $resultado")
		resultado = sub(30,10)
		println(s"A subtração de 30 - 10 : $resultado")
		resultado = multi(30,10)
		println(s"A Multiplicação de 30 * 10 : $resultado")
		resultado = div(30,10)
		println(s"A Divisão de 30 / 10 : $resultado")
	}
}