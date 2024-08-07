package java8;

import java.util.ArrayList;
import java.util.List;

//interface can be implemented in many ways
public class LambdaExpressionExample {
		// 1 - Creting an implementation Class Object
		Test2 t2 = new Test3();
		t2.show();

		// 2 - Anonymus Inner Class
		Test2 t3 = new Test2() {

			@Override
			public void show() {
				System.out.println("Hello");
			}
		};
		t3.show();

		// 3 - Lambda Expression
		Test2 t4 = () -> System.out.println("HIII");

		t4.show();
	}
}

interface Test2 {
	void show();
}


// 1 - Implementation Class
class Test3 implements Test2 {

	@Override
	public void show() {
		System.out.println("hello");
	}

}
