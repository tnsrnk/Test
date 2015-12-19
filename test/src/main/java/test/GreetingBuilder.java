package test;

public class GreetingBuilder {

	public static void main(String[] args) {
		GreetingBuilder gp = new GreetingBuilder();
		System.out.println(gp.getGreeting());
	}
	
	public String getGreeting() {
		return "Hello";
	}

}
