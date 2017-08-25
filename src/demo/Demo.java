package demo;

public class Demo {

	/**
	 * constructor taking varargs
	 */
	Demo(String... args) {

	}

	void doSomething() {

		//anonymous inner class

		new Demo("one","two") {
			{
				System.out.println("initializer");
			}
		};
	}
}
