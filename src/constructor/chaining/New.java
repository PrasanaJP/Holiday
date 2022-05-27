package constructor.chaining;

public class New extends Old{


	public  New() {
		this("Prasanna");
		System.out.println("AppliedGeo Default");
	}

	public New(int rollNo) {
		super();
		System.out.println("AppliedGeo rollno");
	}

	public New(String Name) {
		this(6132);
		System.out.println("AppliedGeo Name");
	}

	public static void main(String[] args) {

		New a = new New();
}
}