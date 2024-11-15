package generics;

public class Box<T> {

	// Object class is parent class of all java object
	T container;

	public Box(T container) {
		this.container = container;
	}
	

	public Object getValue() {

		return this.container;
	}

}
