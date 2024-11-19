
package encapsulation;

import java.util.Scanner;

public class DemoConst {

	public static void main(String args[]) {
		System.out.println("hi , please Enter the String  or wrong");

		Scanner n = new Scanner(System.in);

		System.out.println("You entered the phase :" + n);
		DemoConst o1 = new DemoConst();
		o1.demoname();
		o1.username();
		n.close();
	}

	private void demoname() {
		System.out.println("this is the method of overloading");

	}

	public void username() {

		System.out.println("Method overriding");
	}
}
