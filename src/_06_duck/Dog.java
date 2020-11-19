package _06_duck;

public class Dog {

	int numberOfFriends;
	String favoriteFood;
	
	Dog(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	}
	
	public static void main(String[] args) {
		
	}
	
	void bark() {
		System.out.println("The dog barked");
	}
	
	void run() {
		System.out.println("The dog ran");
	}
}
