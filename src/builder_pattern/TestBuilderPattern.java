package builder_pattern;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Employee emp = Employee.Builder
			.builder()
			.setFirstName("Test")
			.setLastName("Set Last name")
			.setMiddleName("Middle")
			.setAge(30)
			.build();

		System.out.println(emp);
	}

	public void testingTheBuilderPattern() {

	}

}
