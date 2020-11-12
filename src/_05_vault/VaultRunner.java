package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		
		Vault v = new Vault();
		JamesBond j = new JamesBond();
		
		int c = j.findCode(v);
		JOptionPane.showMessageDialog(null, "The code was " + c);
		
	}
}
