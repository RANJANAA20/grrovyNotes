//print "hi Good morning"

/*
i=1
while(i<=3)
{
	n = System.console().readLine "enter pin"
	n = n as int
	if(n==1234)
	{
		print "logged in"
		break
	}
	else if(i==3)
	{
		println "limit crossed"
		break
	}
	else
	{
		i++
	}
}
*/

/* for -in
for (i in [1,2,3,4,5])
{
	println i
}

for (i in 1..10)
{
	println i
}
*/

// defining variable
// global var ( a=3)  by default ; local var ( def a = 3 )
/*
l = ['a','b','c','d','e']
for (i in l)
{
println i
}*/

/*
for (i in 1..10)
{
	if(i==5)
	{
		break
	}
		println i
}
*/

/*
for(i in 1..50)
{
if(i%3==0 && i%5==0)
{
	println "fizzBuzz"
}
else if(i%5==0)
{
	println "Buzz"
}
else if(i%3==0)
{
	println "fizz"
}
else
{
	println i
}
}
*/


/*
n = System.console().readLine "enter num"
n = n as int
switch(n)
{
case 1: 
		println "gn num is 1"
		break
case 2:
		println "gn num is 2"
		break
case 3:
		println "gn num is 3"
		break
case 4..10:
		println "gn num is 4 to 10"
		break
default: println "invalid"
}
*/

/*
n = System.console().readLine "enter num"
n = n as int
switch(n)
{
case 1: 
		println "gn num is 1"
		break
case 2:
		println "gn num is 2"
		break
case 3:
		println "gn num is 3"
		break
case 4..10:
		println "gn num is 4 to 10"
		break
default: println "invalid"
}
*/

/*
ch = System.console().readLine "enter char"
switch(ch)
{
case ~ /[A-Za-z]/:
		
			println "alphabets"
			break
case ~ /[0-9+]/:
	
			println "digits"
			break
case ~ /[^0-9A-Za-z]+/:
		
			println "special char"
			break
default: println "not matched"		
}
*/

// arrays
/*
l = [1,2,3,'a',"groovy"]
len = l.size()
l[4] = "linux"
println l
println "length $len" 
println "1st 3 elements using range l[0..2]" 
println "odd elements using comma l[0,2,4]" 
//l.replace('a','b')
println l 
*/

/*
l = [1,2,3,[10,20,30]]
println l[-1][-1]
l[-1][-1] = 300
println l
*/

/*
l = 'linux'
println l
println l.replace('l','z')
println l
*/

/*
l = [1,2,3,4,5,6,7,8,9,10,2,3]
println l

size = l.size()
println "size() : $size"

c = l.count(2)
println "count() : $c"

r = l.remove(1)
println "remove() : $l"

p = l.pop()
println "pop() : $l"

s = l.sort()
println "sort() : $s"

rev = l.reverse()
println "reverse() : $rev"

Add = l.add(4)
println "add() : $l"

con = l.contains(5)
println "contains() : $con"

Push = l.push(12)
println "push() : $l"

dr = l.drop(3)
println "drop() : $dr"
*/

/* Hmap
m = ["cityhonda":["white",400000],"BMW":["blue",2000000],"Audi":["black",1500000]]
println m
println m['cityhonda']
println m['cityhonda'][1]
println m['cityhonda'][0]="black"
for (i in m)
{

	println i
}
ks = m.keySet()
println "keyset $ks"
v = m.values()
println "values $v"
s = m.size()
println "size $s"
ck = m.containsKey("BMW")
println "containsKey $ck"
for(i in ks)
{
	println i + ":" + m[i]
}

*/

f = new File("C:/Users/ranjanaa.r/Desktop/groovy/test.txt")
k = f.getText()
println k

l = f.readLines()
println l



for(i in l)
{
	if(i.contains("groovy"))
	{
		println i
	}
}
for (i in l[2..5])
{
	println i
}

println "wildcard"
for(i in l)
{
	if(i=~/groovy$/)
	{
		println i
	}
}