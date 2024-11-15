package generics;

public class Example {

	public static void main(String[] args) {
		
		Box<Integer> box = new Box<>(123);
		System.out.println(box.getValue());
		

	}

}
