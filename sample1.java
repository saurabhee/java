package com.scp.abst1;
public interface sample1
{
	public static final int a=10;
	void test();
}

class sample2 implements sample1
{
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Running test() in implementation class");
		
	}
	
}

class Test
{
	public static void main(String[] args) {
		sample2 s=new sample2();
		s.test();
		System.out.println(sample1.a);
		
	}
}