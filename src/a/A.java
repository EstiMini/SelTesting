package a;

import m.C;
import m.D;

public class A extends C {

	public void a1() {
		System.out.println("public");
	}

	protected void a2() {
		System.out.println("protected");
	}

	void a3() {
		System.out.println("default");
	}

	private void a4() {
		System.out.println("private");
	}

	public static void main(String[] args) {
		A z = new A();
		B t = new B();
		C d = new C();
		D y = new D();

		z.a1();
		t.b1();
		d.c1();
		y.d1();

		z.a2();
		t.b2();
		z.c2(); //inheritance 
		z.d2(); //inheritance 

		z.a3();
		t.b3();
//	d.c3();
//	y.d3();

		z.a4();
		//t.b4();
//	d.c4();
//	y.d4();

	}
}
