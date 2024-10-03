package builder_pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TestStreams {

	Employee e1;
	Employee e2;
	Employee e3;
	Employee e4;
	Employee e5;
	Employee e6;

	public static void main(String[] args) {
		TestStreams testStreams = new TestStreams();
		testStreams.st1();

	}

	public void st1() {

		e1 = new Employee("Rohit", "r@gmail.com", "Mumbai", 33);
		e2 = new Employee("Mohit", "m@gmail.com", "Patna", 32);
		e3 = new Employee("Shobhit", "s@gmail.com", "Delhi", 31);
		e4 = new Employee("Ronit", "ro@gmail.com", "Kanpur", 29);
		e5 = new Employee("Lohit", "l@gmail.com", "Aara", 17);

		List<Employee> empList = new ArrayList<>();
		List<Employee> eList = new ArrayList<>();

		empList = List.of(e1, e2, e3, e4, e5);

		AtomicInteger empListSize = new AtomicInteger();
		AtomicInteger currentSize = new AtomicInteger();

		empListSize.set(empList.size());

		empList.forEach(emp -> {

			currentSize.getAndIncrement();

			eList.add(new Employee(emp.name, emp.email, emp.city, emp.age));
			if (currentSize.get() == empListSize.get()) {
				System.out.println("EQUAL");
			}
		});

		empList.stream().map(emp -> eList.add(new Employee(emp.name, emp.email, emp.city, emp.age)))
				.collect(Collectors.toList());
	}

	class Employee {

		String name;
		String email;
		String city;
		Integer age;

		public Employee(String name, String email, String city, Integer age) {

			this.age = age;
			this.city = city;
			this.name = name;
			this.email = email;

		}
	}

}
