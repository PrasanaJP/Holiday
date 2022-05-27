package constructor.chaining;

public class Old {

	public Old() {
		this(75.2);
		System.out.println("Geo default");
	}

	public Old(int rollNo) {
	
		System.out.println("Geo rollno");
	}

	public Old(double percentage) {
		this("Arun");
		System.out.println("Geo percentage");
	}

	public Old(String name) {
this(5525);
		System.out.println("Geo name");
	}
}
