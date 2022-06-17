package org.Class;

public class ClassThree extends ClassTwo {
	public void mathematics1() {
		System.out.println("Mathematics mark is: 75");

	}

	public void mathematics2() {
		System.out.println("Mathematics mark is: 90");

	}

	public static void main(String[] args) {
		ClassThree a = new ClassThree();
		a.Tamil1();
		a.Tamil2();
		a.english1();
		a.english2();
		a.mathematics1();
		a.mathematics2();
	}
}
