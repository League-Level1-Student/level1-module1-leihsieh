package _06_duck;

public class DuckRunner {
	public static void main(String[] args) {
		
		Duck daffy = new Duck("grain", 3);
		
		Dog sparky = new Dog("pork", 5);
		
		daffy.quack();
		sparky.bark();
		
	}
}
