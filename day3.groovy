/*
f = new File("test2.txt")
k = f.getText()
println k

for (i in f.readLines())
{
	if(i=~/ab?c/)
	{
		println i 
	}
}

*/

// how to search line contains only 3 words
/*
f = new File("test2.txt")
for (i in f.readLines())
{
	
	if(i=~/^\w+\s\w+\s+\w+$/)
	{
		println i	
	}
}
*/
// \w+\s\w+\s+\w+ or .*\s.*\s.* or .+\s.+\s.+

// ^\w+\s\w+\s+\w+$ - to have exact words

// name validation
/*
f = new File("test2.txt")
for (i in f.readLines())
{
	
	if(i=~/[a-zA-Z]{2,}/)
	{
		println i	
	}
}
*/
// phno validation
/*
f = new File("test2.txt")
for (i in f.readLines())
{
	if(i=~/^[6-9][0-9]{9}$/ )
	{
		println i	
	}
	
}
*/

// email validation
/*
f = new File("test2.txt")
for (i in f.readLines())
{
	if(i=~/^\w+[@]\w+[.][a-zA-Z]{2,4}$/)
	{
		println i
		println "valid"
	}
	else
	{
	
		println i
		println "not valid"
	}
	
}
*/

// word pattern - exact word
/*
f = new File("test2.txt")
for (i in f.readLines())
{
	if(i=~/ranjanaa\b/)
	{
		println i	
	}
	
}
*/

// function
/*
def fun()
{
	println "I am a function"
}
fun()

def sum(a,b)
{
	def x = 1
	def y = 1
	res = x+y
	println "add : $res"
}
def sub(a,b)
{
	res = a-b
	println "sub : $res"
}
def mul(a,b)
{
	res = a*b
	println "mul : $res"
}
def div(a,b)
{
	res = a/b
	//println "div : $res" 
	return res
}
sum(4,5)
sub(4,2)
mul(5,3)
println "return " + div(8,2)
*/

/*
def avg(name,mark)
{
	println "name : $name"
	sum =  mark.sum() // list method
	total =  mark.size() 
	avg = sum / total
	println "avg : $avg"
	return avg
}
def grade(avg)
{
	if(avg >=80)
	{
		grade = 'A'
	}
	else if(avg >=60)
	{
		grade = 'B'
	}
	else if(avg >=50)
	{
		grade = 'C'
	}
	else
	{
		grade = 'F'
	}
	return grade
}

def detail()
{
mark = [98,92,88,72,66]
avg_mark = avg('Ranjanaa',mark)
println "Average is : " + avg_mark

println "grade is : " + compute_grade
}
detail()
*/

/*
import arithmetic as arith // alias
a = System.console().readLine "Enter number 1: "
a = a as int
b = System.console().readLine "Enter number 2: "
b = b as int
result = new arith().sum(a,b)
println result
*/

// json

/*
import groovy.json.JsonSlurper
def jsonText = '{"name" : "alia","age": 23,"gender": "female"}'
def jsonSlurper = new JsonSlurper()
def jsonObject = jsonSlurper.parseText(jsonText)
println jsonObject
println jsonObject.name
println "Name: $jsonObject.name Age: $jsonObject.age Gender: $jsonObject.gender"
*/

// reading data from json file

/*
import groovy.json.JsonSlurper
def jsonSlurper = new JsonSlurper()
def jsonFile = jsonSlurper.parse(new File('sample.json'))
println jsonFile
*/

// write data into an file
/*
f = new File('test2.txt')
f.append('appended')
for (i in f.readLines())
{
	println i
}
*/

// write data to json file
/*
import groovy.json.JsonOutput

def jsonData = ["role": "ASE"]
def filePath = 'sample.json'
def jsonContent = JsonOutput.toJson(jsonData)
new File(filePath).text = jsonContent
println filePath
*/

// command line args
/*
host = args
Hname = args[0]
uname = args[1]
pwd = args[2]
println args

len = host.size()
if(len==3)
{
	println args
}
else
{
	println "invalid host details "
}
*/

// Exception handling
/*
n1 =12
n2 =3
try
{
	result = n1/n2
	println "res"
}
catch(ArithmeticException e)
{
	println "ArithmeticException occured $e"
}
catch(Exception e)
{
	println "Error occured $e"
}
*/

/*
try
{
f = new File('testk.txt')
l = f.readLines()
println l
}

catch(Exception e)
{
	println e
}
*/

/*
import groovy.json.JsonOutput
def jsonData = ["role": "ASE"]
def filePath = 'sample1.json'
try
{
	def jsonContent = JsonOutput.toJson(jsonData)
	new File(filePath).text = jsonContent
	println filePath
}
catch(Exception e)
{
	println e
}
*/

//oops
class day
{
	def printing()
	{
		println "printing"
	}
}
x = new day()
x.printing()