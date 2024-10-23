package annotation;

@VeryImportant
public class Cat {

	@ImportantString
	String name;
	int age;

	public Cat(String name) {

		this.name = name;

	}

	@RunImmediately(time = 3)
	public void meow() {
		System.out.println("Meow!!");
	}

	public void munch() {
		System.out.println("Munch!!");
	}

}
