package org.Abstrat;

public class FinalAbstract extends AbstractThree {

	@Override
	void english1() {
		System.out.println("English1 mark is: 54");
		
	}

	@Override
	void english2() {
		System.out.println("English2 mark is: 65");
		
	}

	@Override
	void tamil1() {
		System.out.println("Tamil1 mark is: 78");
		
	}

	@Override
	void tamil2() {
		System.out.println("Tamil2 mark is: 70");
		
	}

	@Override
	void mathematics1() {
		System.out.println("Mathematics1 mark is: 95");
		
	}

	@Override
	void mathematics2() {
		System.out.println("Mathematics2 mark is: 25");
		
	}
public static void main(String[] args) {
	FinalAbstract c=new FinalAbstract();
	c.tamil1();
	c.tamil2();
	c.english1();
	c.english2();
	c.mathematics1();
	c.mathematics2();
}

	
}
