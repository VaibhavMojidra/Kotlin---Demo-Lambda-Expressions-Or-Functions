fun main(args: Array<String>) {
	//Kotlin lambda is a function which has no name and defined with a curly braces {} which takes zero or more parameters and body of function.
	
	val upperCase = { str: String -> str.toUpperCase() }
	println(upperCase("hello, world!"))
	
	val n1:Int=4
	val n2:Int=7
	
	val sum={num1:Int,num2:Int-> num1+num2}
	
	val res=sum(n1,n2)
	
	println("$n1+$n2=$res")
}