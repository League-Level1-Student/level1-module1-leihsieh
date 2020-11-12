package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
	
		String finput = JOptionPane.showInputDialog("What flavor popcorn would you like?");
		Popcorn pop = new Popcorn(finput);
		Microwave m = new Microwave();
		
		System.out.println();
		
		String time = JOptionPane.showInputDialog("How many minutes would you like to cook your popcorn?");
		m.putInMicrowave(pop);
		int timeint = Integer.parseInt(time);
		m.setTime(timeint);
		m.startMicrowave();
		
	}
}
