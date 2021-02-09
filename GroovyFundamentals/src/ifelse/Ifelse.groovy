package ifelse

def int a =10
Scanner input = new Scanner(System.in)
a=input.nextInt()

if(a==10)
	print("true")
	else if(a>10)
		print("greater")
		else if(a<10)
			print("small")
			else
				print("out of scope")