package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	
	Random rand = new Random();
	int code = rand.nextInt(1000000);
	
	boolean tryCode(int code) {
		if(this.code == code) {
			return true;
		} else {
			return false;
		}
	}
}

class JamesBond{
	
	int findCode(Vault v){
		
		for(int i = 0; i < 1000000; i++) {
			boolean b = v.tryCode(i);
			if(b==true) {
				return i;
			}
		}
		return -1;
			
	}
}