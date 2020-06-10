package Structures;

public class Singleton {
	public String s;
	
	private Singleton() {
		s = "This is a singleton example";
	}
	
	private static class BillPughSingleton {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return BillPughSingleton.INSTANCE;
	}
	
	public static void main(String[] args) {
		Singleton test1 = Singleton.getInstance();
		Singleton test2 = Singleton.getInstance();
		
		System.out.println(test1 == test2);
		System.out.println(test2.s);
		
		test2.s = test2.s.toUpperCase();
		System.out.println(test1.s);
		System.out.println(test2.s);
	}
}
