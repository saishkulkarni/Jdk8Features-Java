package java8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class ReflectionApiExample {
	public static void main(String[] args) {
		try {
			// Obtain the Class object for Person
			Class<?> personClass = Class.forName("java8.Person");

			// Create a new instance of Person
			Object personInstance = personClass.getConstructor(String.class, int.class).newInstance("Alice", 30);

			// Get and print all fields
			Field[] fields = personClass.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("Field: " + field.getName());
			}

			// Get and print all methods
			Method[] methods = personClass.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println("Method: " + method.getName());
			}

			// Access and modify private fields
			Field nameField = personClass.getDeclaredField("name");
			nameField.setAccessible(true); // Allow access to private field
			System.out.println("Original Name: " + nameField.get(personInstance));
			nameField.set(personInstance, "Bob");
			System.out.println("Updated Name: " + nameField.get(personInstance));

			// Invoke a private method
			Method displayInfoMethod = personClass.getDeclaredMethod("displayInfo");
			displayInfoMethod.setAccessible(true); // Allow access to private method
			displayInfoMethod.invoke(personInstance);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}