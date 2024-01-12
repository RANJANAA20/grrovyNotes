//println "day 4"
/*
class day

{
	def a
	def first()
	{
		a = 1 // or this.a =1
		println "printing first()"
		println a
	}
	def second()
	{
		def b = 2
		println "printing second()"
		println a
		//println a
	}
		
}
x = new day()
println x
x.first()
x.second()
*/

// constructor
/*
class x

{
	def a
	def x(s)
	{
		a = 1 // or this.a =1
		println "printing first()"
		println s
	}
	def second()
	{
		a=2
		def b = 2
		println "printing second()"
		println a
		//println a
	}
		
}
x1 = new x("hi")
x1.second()
*/

// bankApp
/*
class BA
{
	final bankName = "SBI"
	def Amount = 10000
	def withdraw(a)
	{
		if(a<Amount)
		{
			Amount = Amount - a
			println "withdraw amount : $a"
		}
		else
		{
			println "Invalid : withdraw between $Amount"
		}
	}
	def deposit(d)
	{
		Amount = Amount + d
		println "deposit amount : $d"
	}
	def balance()
	{
		println "Balance amount : $Amount"
	}
	def cust_details(name,accNum,bal,addr)
	{
		println "cust_details:"
		println "name : $name"
		println "Bank : $bankName"
		println "accNum : $accNum"
		println "Balance : $bal"
		println "address :$addr"	
	}
}
obj = new BA()
b = obj.Amount
obj.cust_details("A",123456789,b,"chennai")
obj.deposit(500)
obj.withdraw(200)
obj.balance()
*/

// import javaclass in groovy

import MyClass
def javaInstance = new MyClass()
javaInstance.print()