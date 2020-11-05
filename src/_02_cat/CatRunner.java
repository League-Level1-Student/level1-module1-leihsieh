package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
	
		//1. Make the Cat meow
		Cat catt = new Cat("catt");
		catt.meow();
		//2. Get the Cat to print it's name
		catt.printName();
		//3. Kill the Cat!
		catt.kill();
	}
}
