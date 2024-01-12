/*class basic
{
	public static void main(String[] args)
	{
		System.out.println("Hi groovy");
	}
}*/

//println ("hi  Shanaya")
//prin "hi heloo Shanaya";

a=1
b=2.3
c = 'dqw.ert'
//println c.split("\\.")
//d = 'hi i don\'t know'	

//def l = ['a', 'b', 'c']
//def m = '-'
//println l.join(m)
//for( String values : r )
  //    println(values)
//print "datatype : " + c.getClass()
//print r[0]
//print a + c + b + d

/*
num1=System.console().readLine "enter num1"
num1=num1 as int
num2=System.console().readLine "enter num2"
num2=num2.toInteger()
sum=num1+num2
println "sum of $num1 and $num2 is $sum1"
if (sum > 0)
print "positive"*2
else
print "negative"
*/

/*
num=10
while(num>1)
{
print num
num--
}*/


while(true)
{
num = System.console().readLine "enter num"
num = num as int
if(num>0)
{
print num*num
}
else if(num<0)
{
continue
}
else
{
break
}
}