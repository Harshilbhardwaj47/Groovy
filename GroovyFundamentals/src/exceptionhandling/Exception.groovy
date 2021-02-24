package exceptionhandling

class Example {
	static void main(String[] args) {
	   try {
		  def arr = new int[3];
		  arr[5] = 5;
	   } catch(Exception ex) {
		  println("Catching the exception");
	   }
		 
	   println("Let's move on after the exception");
	}
 }// use class while doing exception handling it helps out 