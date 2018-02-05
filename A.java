package com.scp.abst1;

abstract class A {

	abstract void calculate(int x); // Abstract method

	void display() // Concrete method
	{
		System.out.println("Welcome");
	}

}

class c extends A {
	void calculate(int x) {
		System.out.println("square is=" + (x * x));
		

	}

	
	
	
	public static void main(String[] args) {

		c c1 = new c();
		c1.display();
		c1.calculate(4);
		
	}
   
		
}		



