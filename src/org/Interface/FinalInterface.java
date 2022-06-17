package org.Interface;

public class FinalInterface implements InterfaceOne, InterfaceTwo, InterfaceThree {

	@Override
	public void mathematics1() {
		System.out.println("Mathematics1 mark is: 45");
		
	}

	@Override
	public void mathematics2() {
		System.out.println("Mathematics2 mark is: 70");
		
	}

	@Override
	public void english1() {
		System.out.println("English1 mark is: 68");
		
	}

	@Override
	public void english2() {
		System.out.println("English2 mark is: 97");
		
	}

	@Override
	public void tamil1() {
		System.out.println("Tamil1 mark is: 91");
		
	}

	@Override
	public void tamil2() {
		System.out.println("Tamil2 mark is:80");
		
	}

	public static void main(String[] args) {
		FinalInterface b = new FinalInterface();
		b.tamil1();
		b.tamil2();
		b.english1();
		b.english2();
		b.mathematics1();
		b.mathematics2();
	}
}
