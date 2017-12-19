
public class person {
	// getters/accessors and setters/mutators.
	String name1;
	int age1;

	void speak() {
		System.out.println("My name is: " + name1);
	}

	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age1;

		return yearsLeft;
	}

	int getAge() {
		return age1;
	}

	String getName() {
		return name1;
	}
}
