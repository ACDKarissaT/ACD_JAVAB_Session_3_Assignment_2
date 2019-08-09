package assignment2;

class ST extends SuperThis {
	int x;
	
	public ST() {
		super();
		System.out.println("ST default Constructor: ");
		this.x = 3;
		
	}
	
	public ST(String s) {
		this();
		System.out.println("Your string: " + s);
	}
	
	void printNums () {
		System.out.println("ST print: ");
		System.out.println("this x:" + this.x);
		System.out.println("super x: " + super.x);
		super.printNums();
	}
}
public class SuperThis {
	int x;
	
	public SuperThis() {
		System.out.println("SuperThis Constructor:");
		this.x = 6;
	}
	
	void printNums () {
		System.out.println("SuperThis print: ");
		System.out.println("x: " + this.x);
	}
	
	public static void main(String[] args) {
		ST st = new ST("Hello.");
		st.printNums();
	}
}
