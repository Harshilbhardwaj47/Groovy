package ifelse

import groovy.transform.Undefined.EXCEPTION

def int x

Scanner input = new Scanner(System.in)
x=input.nextInt()

switch(x) {
	case 0:
		print("1")
		break 
		
	case 1:
	print("2")
	break
	
	default:
	print("error")
}