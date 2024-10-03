package builder_pattern;

public class Employee {

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;

	public Employee(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.middleName = builder.middleName;
		this.age = builder.age;
	}

	public String toString() {

		return firstName + " " + lastName + " " + middleName + " " + age;

	}

	public static class Builder {

		private String firstName;
		private String middleName;
		private String lastName;
		private int age;

		private Builder() {

		}

		public static Builder builder() {
			return new Builder();
		}

		public Builder setFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder setMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public Builder setLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public int getAge() {
			return this.age;
		}

		public Employee build() {
			return new Employee(this);
		}
	}

}
